package com.hero78.todo.businesslogic.task;

import com.hero78.todo.controller.v1.task.Task;
import com.hero78.todo.jpa.modal.MTask;
import com.hero78.todo.jpa.modal.MUser;
import com.hero78.todo.persistance.jpa.staff.JpaTaskRepository;
import com.hero78.todo.persistance.jpa.staff.JpaUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class TaskService {
    @Autowired
    private JpaTaskRepository taskRepository;
    @Autowired
    private JpaUserRepository userRepository;

    public  String createStaff(Task task){
        MTask mTask = new MTask();
        BeanUtils.copyProperties(task,mTask);
        mTask.setCreatedOn(new Date());
        mTask.setUserId(getDefaultUserId());

        return taskRepository.save(mTask).getId();
    }

    private  MUser getDefaultUserId(){
        Iterable<MUser> mUsers =  userRepository.findAll();
       return mUsers.iterator().hasNext() ? mUsers.iterator().next() :null;
    }

    public Task getTaskById(String id){
        MTask mTask = taskRepository.findById(id).orElse(null);
        Task task = new Task();
        BeanUtils.copyProperties(mTask,task);
        task.setUserId(mTask.getId());
        return task;
    }

    public List<Task> getListOfTasks(){
        Iterable<MTask> mTasks = taskRepository.findAll();
        List<Task> taskList = new ArrayList<>();
        mTasks.forEach(t->{
            Task task = new Task();
            BeanUtils.copyProperties(t,task);
            task.setUserId(t.getId());
            taskList.add(task);
        });
        return taskList;
    }
}

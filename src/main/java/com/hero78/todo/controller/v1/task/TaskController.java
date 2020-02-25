package com.hero78.todo.controller.v1.task;

import com.hero78.todo.businesslogic.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createTask(@RequestBody Task task){
        return taskService.createStaff(task);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Task getTaskById(@PathVariable String id){
    return taskService.getTaskById(id);
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Task> getListOfTask(){return taskService.getListOfTasks();}
}

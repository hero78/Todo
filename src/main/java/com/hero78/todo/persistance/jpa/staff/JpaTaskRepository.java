package com.hero78.todo.persistance.jpa.staff;

import com.hero78.todo.jpa.modal.MTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends CrudRepository<MTask,String> {
}

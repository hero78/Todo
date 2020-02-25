package com.hero78.todo.persistance.jpa.staff;

import com.hero78.todo.jpa.modal.MUser;
import org.springframework.data.repository.CrudRepository;

public interface JpaUserRepository  extends CrudRepository<MUser,String> {
}

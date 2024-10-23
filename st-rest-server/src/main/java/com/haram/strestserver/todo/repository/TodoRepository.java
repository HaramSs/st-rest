package com.haram.strestserver.todo.repository;

import com.haram.strestserver.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}

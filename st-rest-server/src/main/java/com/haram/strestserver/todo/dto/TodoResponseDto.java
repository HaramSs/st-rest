package com.haram.strestserver.todo.dto;

import com.haram.strestserver.todo.entity.TodoEntity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class TodoResponseDto {

    private Integer id;
    private String subject;
    private String body;
    private Boolean completed;
    private LocalDateTime createdAt;

    public TodoResponseDto(TodoEntity todo) {
        this.id = todo.getId();
        this.subject = todo.getSubject();
        this.body = todo.getBody();
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }
}

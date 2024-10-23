package com.haram.strestserver.todo.entity;

import com.haram.strestserver.todo.dto.TodoRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Entity
public class TodoEntity {


    /* Todo 고유 번호/*/
    //    제목
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String subject;
    /*내용*/
    private String body;
    /*완료여부*/
    private Boolean completed;
    /*기입 시간 저장*/
    private LocalDateTime crteateAt;

    public TodoEntity(TodoRequestDto todoRequestDto) {

        this.subject= todoRequestDto.getSubject();
        this.body = todoRequestDto.getBody();
        this.completed = false;
        this.crteateAt = LocalDateTime.now();
    }

    public TodoEntity() {

    }
}

package com.haram.strestserver.todo.controller;

import com.haram.strestserver.todo.dto.TodoRequestDto;
import com.haram.strestserver.todo.dto.TodoResponseDto;
import com.haram.strestserver.todo.entity.TodoEntity;
import com.haram.strestserver.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
@Slf4j
public class TodoController {

    private final TodoService todoService;

    /* C - Create */
    @PostMapping("/create")
    public ResponseEntity<TodoResponseDto> createTodo(@RequestBody TodoRequestDto requestDto){
        log.info(requestDto.toString());

        TodoResponseDto todo = todoService.createTodo(requestDto);
        return ResponseEntity.ok().body(todo);
    }


}

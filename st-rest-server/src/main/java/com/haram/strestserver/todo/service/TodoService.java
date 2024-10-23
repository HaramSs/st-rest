package com.haram.strestserver.todo.service;

import com.haram.strestserver.todo.dto.TodoRequestDto;
import com.haram.strestserver.todo.dto.TodoResponseDto;
import com.haram.strestserver.todo.entity.TodoEntity;
import com.haram.strestserver.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    /*할 일 저장*/
    public TodoResponseDto createTodo(TodoRequestDto RequestDto){
        TodoEntity newTodo =  new TodoEntity(RequestDto);
        TodoEntity save = todoRepository.save(newTodo);



        return new TodoResponseDto(save);
    }
}

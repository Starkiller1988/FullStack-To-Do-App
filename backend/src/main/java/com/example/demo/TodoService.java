package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodos(){
        return todoRepository.getTodos();
    }

    public void createTodo(Todo todo){
        todoRepository.createTodo(todo);
    }

    public Todo getTodo(String id){
        return todoRepository.getTodo(id)
                .orElseThrow();
    }

    public List<Todo> getTodoByName(String todo){
        return todoRepository.getTodos().stream()
                .filter(p -> p.getTodo().toLowerCase(Locale.ROOT).contains(todo.toLowerCase(Locale.ROOT)))
                        .toList();
    }
}

package com.example.demo;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class TodoRepository {

    private final List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos(){
        return todos;
    }

    public void createTodo(Todo todo){
        todos.add(todo);
    }

    public Optional<Todo> getTodo(String id){
        return todos.stream()
                .filter(p -> Objects.equals(id, p.getId()))
                .findFirst();
    }

}

package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")

public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable String id){
        return todoService.getTodo(id);
    }

    @PostMapping
    public void createTodo(@RequestBody Todo todo){
        todoService.createTodo(todo);
    }

    @GetMapping("/search")
    public List<Todo> search(@RequestParam String searchValue){
        return todoService.getTodoByName(searchValue);
    }
}

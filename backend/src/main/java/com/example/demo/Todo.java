package com.example.demo;

public class Todo {

    private String todo;
    private String id;

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Todo(String todo, String id) {
        this.todo = todo;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todo='" + todo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

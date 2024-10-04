package com.example.rest.controller;

import com.example.rest.dto.StatusDTO;
import com.example.rest.entity.Todo;
import com.example.rest.repository.TodoPagingAndSortingRepository;
import com.example.rest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoPagingAndSortingRepository todoPagingAndSortingRepository;

    //    TODO: Get all Todos
    @GetMapping("/todos")
    public List<Todo> getTodos() {
        List<Todo> todos = (List<Todo>) todoRepository.findAll();
        return todos;
    }

    //    TODO: Add a new Todo
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo) {
        Todo savedTodo = todoRepository.save(todo);
        return savedTodo;
    }

    //    TODO: Update a Todo
    @PutMapping("/todos")
    public Todo updateTodo(@RequestBody Todo todo) {
        if (!todoRepository.existsById(todo.getTodoId()))
            return null;

        Todo updatedTodo = todoRepository.save(todo);
        return updatedTodo;
    }

    //    TODO: Delete a Todo
    @DeleteMapping("/todos/{todoId}")
    public StatusDTO deleteTodo(@PathVariable int todoId) {
        if (!todoRepository.existsById(todoId))
            return new StatusDTO(false);

        todoRepository.deleteById(todoId);
        return new StatusDTO(true);
    }
}
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    
    @Autowired
    private JsonPlaceholderClient jsonPlaceholderClient;
    
    @GetMapping("/users")
    public String getUsers() {
        return jsonPlaceholderClient.getUsers();
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return jsonPlaceholderClient.getTodos();
    }
}

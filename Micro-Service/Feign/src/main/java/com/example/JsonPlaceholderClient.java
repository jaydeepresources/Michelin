package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "jsonPlaceholderClient", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceholderClient {
    
    @GetMapping("/users")
    String getUsers();

    @GetMapping("/todos")
    public List<Todo> getTodos();
}

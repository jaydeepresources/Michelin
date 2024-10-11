package com.example.micro_circuit_breaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/api/data")
    public Object getData(){
       return myService.callExternalService();
    }

}

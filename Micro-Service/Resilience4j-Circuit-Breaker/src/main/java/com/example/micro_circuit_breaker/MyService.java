package com.example.micro_circuit_breaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    private final RestTemplate restTemplate = new RestTemplate();

    public Object callExternalService() {
        return circuitBreakerFactory.create("myCircuitBreaker").run(
            () -> restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Object.class),
            throwable -> fallbackMethod()
        );
    }

    public String fallbackMethod() {
        return "Fallback response";
    }
}

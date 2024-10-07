package com.example.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TodoNotFoundException.class)
    ResponseEntity<String> handleTodoNotFound(TodoNotFoundException todoNotFoundException){
        return new ResponseEntity<String>("Todo doesn't exist (G).", HttpStatus.NOT_FOUND);
    }

}

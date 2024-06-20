package com.dictionaryapp.config;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionMapping {

//    @ExceptionHandler(EntityNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public void handleNotFound() {
//    }

    @ExceptionHandler(EntityNotFoundException.class)
    public String handleNotFound() {
        return "oops";
    }
}

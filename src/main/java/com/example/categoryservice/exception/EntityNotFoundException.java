package com.example.categoryservice.exception;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException() {
    }

    public EntityNotFoundException(String message) {
        super(message);
    }
}

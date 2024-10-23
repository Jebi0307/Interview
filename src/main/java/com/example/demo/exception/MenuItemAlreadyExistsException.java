package com.example.demo.exception;

public class MenuItemAlreadyExistsException extends RuntimeException{

    public MenuItemAlreadyExistsException(String message) {
        super(message);
    }
}

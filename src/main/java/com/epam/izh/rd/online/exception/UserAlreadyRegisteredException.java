package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Exception {
    public UserAlreadyRegisteredException() {
    }

    public UserAlreadyRegisteredException(String message) {
        super(message);
    }
}
package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {
    public NotCorrectPasswordException() {
    }

    public NotCorrectPasswordException(String message) {
        super(message);
    }
}

package com.nurtilektavaldiev.spring.rest.configuration.exception_hangling;

public class NoSuchEmployeeException extends RuntimeException {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}

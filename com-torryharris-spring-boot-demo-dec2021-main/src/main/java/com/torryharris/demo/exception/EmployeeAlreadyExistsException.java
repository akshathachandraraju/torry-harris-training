package com.torryharris.demo.exception;

public class EmployeeAlreadyExistsException extends RuntimeException{
    private static final long serialVersionId=0;

    public EmployeeAlreadyExistsException() {
    }

    public EmployeeAlreadyExistsException(String message) {
        super(message);
    }
}

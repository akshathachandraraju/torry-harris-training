package com.torryharris.demo.exception;

public class DepartmentAlreadyExistsException extends RuntimeException{
    private static final long serialVersionId=0;

    public DepartmentAlreadyExistsException() {
    }

    public DepartmentAlreadyExistsException(String message) {
        super(message);
    }
}

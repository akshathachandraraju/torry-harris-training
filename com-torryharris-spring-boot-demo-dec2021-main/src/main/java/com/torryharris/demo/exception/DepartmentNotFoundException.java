package com.torryharris.demo.exception;

public class DepartmentNotFoundException extends RuntimeException{

    private static final long serialVersionId=0;

    public DepartmentNotFoundException() {
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}

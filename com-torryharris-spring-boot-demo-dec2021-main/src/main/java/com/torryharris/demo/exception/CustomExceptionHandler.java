package com.torryharris.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<Object> handleDepartmentNotFoundException() {
        LOG.error("handleDepartmentNotFoundException");
        HttpHeaders headers = new HttpHeaders();
        headers.add("message", "This department does not exist.");
        return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
    }
}

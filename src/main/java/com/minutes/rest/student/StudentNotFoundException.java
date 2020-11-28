package com.minutes.rest.student;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}

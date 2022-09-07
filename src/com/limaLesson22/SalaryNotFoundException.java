package com.limaLesson22;

public class SalaryNotFoundException extends RuntimeException {
    public SalaryNotFoundException() {
    }

    public SalaryNotFoundException(String message) {
        super(message);
    }

    public SalaryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalaryNotFoundException(Throwable cause) {
        super(cause);
    }


}

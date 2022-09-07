package com.InputOutput;

public class AppEx extends RuntimeException {
    public AppEx() {
    }

    public AppEx(String message) {
        super(message);
    }

    public AppEx(String message, Throwable cause) {
        super(message, cause);
    }

    public AppEx(Throwable cause) {
        super(cause);
    }
}

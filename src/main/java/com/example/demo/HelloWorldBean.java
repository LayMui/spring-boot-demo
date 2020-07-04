package com.example.demo;

public class HelloWorldBean {
    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}

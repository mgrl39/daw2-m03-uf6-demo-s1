package com.github.mgrl39.demos1;

public class Hello {
    int id;
    String message;

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Hello(String message) {
        this.message = message;
        id = 1;
    }
}

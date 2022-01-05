package com.example.demo.until;

import lombok.Data;

@Data
public class Message {
    public static final int STATUS_OK = 1;
    public static final int STATUS_FAIL = 0;

    public static final String MESSAGE_OK = "成功";
    public static final String MESSAGE_FAIL = "失败";

    private int status = STATUS_OK;
    private String message = MESSAGE_OK;

    public Message() {
        super();
    }

    public Message(int status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public boolean isOk() {
        return !this.isFail();
    }

    private boolean isFail() {
        return this.status == 0;
    }

    public static Message ok(String message) {
        return new Message(STATUS_OK, message);
    }

    public static Message fail(String message) {
        return new Message(STATUS_FAIL, message);
    }

    public static Message ok() {
        return ok(MESSAGE_OK);

    }
}

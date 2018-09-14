package scopes.beans;


import java.time.LocalTime;

public class MessageBean {

    private String message;

    public MessageBean() {
        LocalTime currentTime = LocalTime.now();
        message = "MessageBean " + currentTime;
    }

    public String getMessage() {
        return message;
    }
}
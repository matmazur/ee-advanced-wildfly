package scopes.beans;


import javax.enterprise.context.RequestScoped;
import java.time.LocalTime;

@RequestScoped
public class RequestTime {

    private String message;

    public RequestTime() {
        LocalTime currentTime = LocalTime.now();
        message = currentTime.toString();
    }

    public String getMessage() {
        return message;
    }
}
package scopes.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.time.LocalTime;

@RequestScoped
public class RequestTime {

    private String message;

    public RequestTime() {
        LocalTime currentTime = LocalTime.now();
        message = currentTime.toString();
    }
    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct() Request");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("PreDestroy() Request");
    }
    public String getMessage() {
        return message;
    }
}
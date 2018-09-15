package scopes.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalTime;

@SessionScoped
public class SessionTime implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;

    public SessionTime() {
        LocalTime currentTime = LocalTime.now();
        message = currentTime.toString();
    }

    public String getMessage() {
        return message;
    }
    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct() Session");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("PreDestroy() Session");
    }
}
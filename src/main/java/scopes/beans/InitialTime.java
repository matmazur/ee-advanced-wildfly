package scopes.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalTime;

@ApplicationScoped
public class InitialTime  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;

    public InitialTime() {
        LocalTime currentTime = LocalTime.now();
        message = currentTime.toString();
    }

    public String getMessage() {
        return message;
    }
    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct() App");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("PreDestroy() App");
    }
}

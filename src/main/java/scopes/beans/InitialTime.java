package scopes.beans;

import java.time.LocalTime;

public class InitialTime { private String message;

    public InitialTime() {
        LocalTime currentTime = LocalTime.now();
        message = currentTime.toString();
    }

    public String getMessage() {
        return message;
    }

}

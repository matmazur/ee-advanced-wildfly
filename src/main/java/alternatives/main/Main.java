package alternatives.main;

import alternatives.service.UserService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        UserService userService = container.select(UserService.class).get();
        userService.printUser(25L);

        container.shutdown();
    }
}

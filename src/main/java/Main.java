import beans.UserDao;
import beans.UserDaoImpl;
import model.User;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;
import java.time.Duration;
import java.time.Instant;

public class Main {


    public static void main(String[] args) {


        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MessagePrinter printer = container.instance().select(MessagePrinter.class).get();
        printer.getMessage();

        UserDao userDao = container.select(UserDao.class).get();
        Instant start = Instant.now();
        User read = userDao.read(25L);
        Duration execTime = Duration.between(start, Instant.now());
        System.out.printf("UserDao.read() method execution time: %dnanos \n" ,execTime.toNanos());
        System.out.println(read);


        weld.shutdown();


    }
}

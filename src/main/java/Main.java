import beans.UserDao;
import beans.UserDaoImpl;
import model.User;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.inject.Inject;

public class Main {


    public static void main(String[] args) {


        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MessagePrinter printer = container.instance().select(MessagePrinter.class).get();
        printer.getMessage();

        UserDao dao = new UserDaoImpl();
        System.out.println(dao.save(new User(2, "Mary", "Poppins")));
        weld.shutdown();


    }
}

import dependancyInjectionRevision.FileMessageProducer;
import dependancyInjectionRevision.MessagePrinter;
import org.jboss.weld.context.ApplicationContext;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * This is a simple class executing 2 classes:
 * <p>
 * HelloWorld
 * <p>
 * StringUnicodeChecker
 */
public class Main {


    public static void main(String[] args) {


        HelloWorld helloWorld = new HelloWorld();
        StringUnicodeChecker checker = new StringUnicodeChecker();

        System.out.println(helloWorld.hello());

        try {
            System.out.println(checker.check("Mark"));
            System.out.println(checker.check("Mark12"));
        } catch (NoClassDefFoundError e) {
            System.out.println("There is no class StringUtils found");
        }

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        MessagePrinter printer = container.select(MessagePrinter.class).get();
        printer.getMessage();

        weld.shutdown();


    }
}

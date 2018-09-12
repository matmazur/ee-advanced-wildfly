import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void doesHelloWorkProperly() {


        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.hello();


        assertEquals( "Hello World!", result);

    }
}
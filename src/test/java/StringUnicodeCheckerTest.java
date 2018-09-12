import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUnicodeCheckerTest {

    @Test
    public void shouldReturnTrue() {

        StringUnicodeChecker checker  = new StringUnicodeChecker();
        boolean result = checker.check("Mark");


        assertTrue("Should return true", result);
    }

    @Test
    public void shouldReturnFalse() {

        StringUnicodeChecker checker  = new StringUnicodeChecker();
        boolean result = checker.check("Mark44");


        assertFalse("Should return false", result);
    }
}
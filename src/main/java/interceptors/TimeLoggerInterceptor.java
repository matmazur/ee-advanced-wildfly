package interceptors;

import model.User;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

@TimeLogger
@Interceptor
public class TimeLoggerInterceptor {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext ic) {


        Instant start = Instant.now();

        System.out.println("Before try-catch");
        try {
            System.out.println("proceed");
            return ic.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            Duration execTime = Duration.between(start, Instant.now());
            Method method = ic.getMethod();
            System.out.printf("%s.%s method execution time: %dnanos \n", method.getDeclaringClass().getSimpleName(), method.getName(), execTime.toNanos());
        }
        return null;
    }
}

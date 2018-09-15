package interceptors;


import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@InterceptorBinding
@Target({METHOD,TYPE,})
@Retention(RUNTIME)
public @interface TimeLogger {
}

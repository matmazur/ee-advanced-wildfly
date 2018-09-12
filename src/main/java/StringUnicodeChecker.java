import org.apache.commons.lang3.StringUtils;

public class StringUnicodeChecker {


    /**
     * This is a simple method that check if
     *
     *  string introduced as a method attribute
     *
     *  is in fact written only with Unicode
     */


    public boolean check(String string){
        return StringUtils.isAlpha(string);
    }


}

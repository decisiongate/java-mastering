package mastering;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherImpl {
    public void task()
    {
        Pattern pattern = Pattern.compile("parameter 1", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("The parameters contain: parameter 1, parameter 2, parameter 3");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}

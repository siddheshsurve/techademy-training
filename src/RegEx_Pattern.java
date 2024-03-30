import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx_Pattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("JavaCoding", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Learn JavaCoding is Fun");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match Found");
        } else {
            System.out.println("Match Not Found");
        }
    }
}

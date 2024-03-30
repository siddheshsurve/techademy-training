import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Validation {
    public static void main(String[] args) {
        //Sample array data
        String[] strings = {
                "123456",
                "3.55",
                "Java Code",
                "asda",
                "122sdd33",
                "reg_ex",
                "+200"
        };

        //pattern creating regular expression for numbers to validate
//        String numberPattern = "[-+]?\\d*\\.?\\d+";
        String pattern = "^[a-zA-Z_ ][a-zA-Z0-9_ ]*$";

        Pattern regex = Pattern.compile(pattern);

        for(String str: strings) {
            Matcher matcher = regex.matcher(str);
            if(matcher.matches()) {
                System.out.println(str + " is a valid String");
            } else {
                System.out.println(str + " is a invalid String");
            }
        }
    }
}

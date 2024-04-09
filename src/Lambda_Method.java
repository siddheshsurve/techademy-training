interface StrFun {
    String run(String str);
}

public class Lambda_Method {
    public static void main(String[] args) {
        StrFun exclaim = (s) -> s+"!!";
        StrFun query = (s) -> s+"??";
        ask("Hello", exclaim);
        ask("Are you okay", query);
    }

    public static void ask(String str, StrFun format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda_Expression {
    //Lambda using arraylist
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(23);
        numbers.add(94);
        numbers.add(90);
        numbers.add(50);

//        numbers.forEach((n) -> {
//            System.out.println(n);
//        });

        Consumer<Integer> myMethod = (n) -> {
            System.out.println(n);
        };

        numbers.forEach(myMethod);
    }
}

import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_program {
    //Iterator
    //Making a collection
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(300);
        numbers.add(200);
        numbers.add(400);
        numbers.add(50);
        numbers.add(90);

        Iterator<Integer> num = numbers.iterator();
        while(num.hasNext()) {
            Integer i = num.next();
            if(i < 100) {
                num.remove();
            }
        }
        System.out.println(numbers);
//        ArrayList<String> fruits = new ArrayList<String>();
//        fruits.add("Apple");
//        fruits.add("Mango");
//        fruits.add("Kiwi");
//        fruits.add("Grapes");
//        fruits.add("Orange");
//
//        //Getting an iterator method
//        Iterator<String> item = fruits.iterator();

        //Loop through of iterator
//        while(item.hasNext()) {
//            System.out.println(item.next());
//        }

        //
    }
}

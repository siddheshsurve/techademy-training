import java.util.ArrayList;
import java.util.Collections; //has sort() method

public class ArrayList_program {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(89);
        marks.add(70);
        marks.add(67);
        marks.add(90);

        //collection of items for applying sorting
        Collections.sort(fruits);

        for(int i=0; i<fruits.size(); i++) {
            System.out.println("Fruit id : " + (i+1) + " " +fruits.get(i));
        }
        System.out.println();
        int i=0;
        for(String fruit: fruits) {
            System.out.println("Fruit id : "+ (i+1) + " " + fruit);
            i++;
        }

        for(int mark : marks) {
            System.out.println(mark);
        }
        Collections.sort(marks);
        System.out.println();
        for(int mark : marks) {
            System.out.println(mark);
        }

    }
}

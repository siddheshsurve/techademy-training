import java.util.LinkedList;
public class LinkedList_program {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<String>();
        countries.add("USA");
        countries.add("UK");
        countries.add("Australia");
        countries.add("Russia");
        countries.add("Japan");

        //adding an item at first loc
        countries.addFirst("India");
        countries.addLast("China");

        System.out.println(countries.getFirst());
    }
}

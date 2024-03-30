import java.util.HashSet;
public class HashSet_program {
    public static void main(String[] args) {
        //creating hashset objet
        HashSet<String> sports = new HashSet<String>();
        sports.add("Football");
        sports.add("Cricket");
        sports.add("Tennis");
        sports.add("Badminton");
        sports.add("Hockey");
        sports.add("Cricket");

        for(String sport : sports) {
            System.out.println(sport);
        }
    }
}

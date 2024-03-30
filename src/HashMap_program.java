import java.util.HashMap;
public class HashMap_program {
    //create hashmap object called capitalCities
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //Adding keys and values (Countries, CapCity)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("South Africa", "Cape Town");
        capitalCities.put("Australia", "Adelaide");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "New York");
        //keyset() -- getting only keys.
        //values() -- to get only values.

        //loop through the keys
//        for(String i: capitalCities.values()) {
//            System.out.println(i);
//        }
        //loop through keys and vals to print both
        for(String i: capitalCities.keySet()) {
            System.out.println("Key:"+ i + ", Value:"+ capitalCities.get(i));
        }
    }
}

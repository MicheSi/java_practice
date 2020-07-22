package hashmap;

import java.util.ArrayList;  // ArrayList needed for sorting requires this import
import java.util.Comparator; // When we sort, we use Comparator which requires this import
import java.util.HashMap;    // HashMap requires this import
import java.util.List;       // List needed for sorting requires this import
import java.util.Map;        // Map requires this import

public class Main {
    public static void main(String[] args) {
        // Declare a Map called cities with keys as strings and values as integers
        Map<String, Integer> cities = new HashMap<>();

        // put new key, value pairs into HashMap
        cities.put("Lehi", 62712);
        cities.put("Seattle", 724745);
        cities.put("San Francisco", 884363);
        cities.put("Austin", 1000000);
        cities.put("Denver",  619968);
        cities.put("Raleigh", 464758);
        cities.put("New York City", 8623000);

        // putting a ket that already exists will replace the value
        cities.put("Austin", 950715);

        // Display HashMap
        System.out.println("\n*** The HashMap ***");
        System.out.println(cities);

        // Check if HashMap has a certain key using containsKey() - returns True or False
        System.out.println("\nHashMap contains Raleigh as a key: " + cities.containsKey("Raleigh"));
        // Check if HashMap contains a certain value - containsValue() - returns True or False
        System.out.println("HashMap contains the value 1000000: " + cities.containsValue(1000000));

        // Calculate size using size()
        System.out.println("\nSize of the HashMap is " + cities.size());

        // Remove an item based off a key
        cities.remove("Seattle");
        cities.remove("Portland"); // Since Portland is not a key, does nothing

        System.out.println("\nHashMap with one Removed");

        // Use For Each loop to print key, value pairs
        // Loop through entries - set called entrySet
        for (HashMap.Entry mapElem : cities.entrySet()) {
            System.out.print("Key is " + mapElem.getKey()); // print() does not start next line on a new line, so no return at end of print statement
            System.out.println("   Value is " + mapElem.getValue());
        }

        // Cannot sort HashMap directly, must be converted to ArrayList
        List<HashMap.Entry> myList = new ArrayList<>(cities.entrySet());

        // sort by keys
        myList.sort(Comparator.comparing(o -> o.getKey().toString()));

        System.out.println("\nSorted by Key");
        System.out.println(myList);

        // sort by value in descending order
        myList.sort(Comparator.comparing(o -> (int) o.getValue(), Comparator.reverseOrder()));

        System.out.println("\nSort by Value");
        System.out.println(myList);

        // Clear out the HashMap
        myList.clear();
        System.out.println("\nThe HashMap Cleared");
        System.out.println(myList);
    }
}
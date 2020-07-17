package arraylist;

import java.util.ArrayList;   // the ArrayList requires this import
import java.util.Collections; // required import for sorting the ArrayList
import java.util.Comparator;  // required import for sorting the ArrayList in descending order
import java.util.List;        // the List requires this import

public class Main {
    public static void main(String[] args) {
        // declare list called cities which takes Strings
        // initialize it as ArrayList with String
        // String intialization on right of = can be inferred for left
        List<String> cities = new ArrayList<>(); // same as List<String> cities = new ArrayList<String>();
        
        // add new strings to ArrayList - order is maintained
        cities.add("Lehi");
        cities.add("Seattle");
        cities.add("San Francisco");
        cities.add("Austin");
        cities.add("Denver");
        cities.add("Raleigh");
        cities.add("New York City");

        // adding value that already exists is same as adding any other value - gets added to end
        cities.add("Austin");

        // Display ArrayList. \n equals blank line
        System.out.println("*** The ArrayList ***");
        System.out.println(cities);

        // Find particular element in ArrayList, use get(index)
        System.out.println("The element at index 0 is " + cities.get(0));

        // Check if particular value in ArrayList, use contains("") - returns True or False
        // \ before quotes tells Java to display as part of string - called escape character
        System.out.println(); // prints a blank line
        System.out.println("The ArrayList contains \"New York City\": " + cities.contains("New York City"));
        System.out.println("The ArrayList contains \"Portland\": " + cities.contains("Portland"));

        // set(index, new value) replaces the element at given index
        System.out.println("\nReplacing element at index 3");
        System.out.println("Original element at index 3: " + cities.get(3));
        cities.set(3, "Portland");
        System.out.println("Replaced element \"Portland\" at index 3: " + cities.get(3));

        // add(index, new value) add new element to given index, pushing all others one index higher
        System.out.println("\nBefore adding element at index 3");
        System.out.println(cities);
        cities.add(3, "Austin");
        System.out.println("After adding \"Austin\" element at index 3");
        System.out.println(cities);

        // remove(index) to remove an element
        cities.remove(3);
        System.out.println("\nRemoved index 3 so the first \"Austin\"");

        // loop through elements in ArrayList using a For Each loop
        for (String c : cities) {
            System.out.println(c);
        }

        // calculate size of ArrayList using method size();
        System.out.println("\nSize of the ArrayList is " + cities.size());

        // print ArrayList using standard For loop
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("Index: " + i + " Value: " + cities.get(i));
        }
    }
}

/*
javac arraylist/*.java
jar cvfe arraylist.jar arraylist.Main arraylist/*.class
java -jar arraylist.jar
*/
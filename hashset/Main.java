package hashset;

import java.util.ArrayList;   // ArrayList needed for sorting requires this import
import java.util.HashSet;     // HashSet requires this import
import java.util.Iterator;    // Iterator needing for looping through the HashSet requires this import
import java.util.List;        // List needed for sorting requires this import
import java.util.Set;         // Set requires this import
import java.util.Collections; // needed to sort the ArrayList

public class Main {
    public static void main(String[] args) {
        // declare a Set called h with string elements and initialize a HashSet with string elements
        Set<String> h = new HashSet<>();

        // add elements to HashSet with add()
        h.add("Lehi");
        h.add("Seattle");
        h.add("San Francisco");
        h.add("Austin");
        h.add("Denver");
        h.add("Raleigh");
        h.add("New York City");
        h.add("Austin"); // trying to add a duplicate just gets ignored

        // Display HashSet
        System.out.println("\n*** The HashSet ***");
        System.out.println(h);

        // Determine if the HashSet contains a certain value use the contains() - returns a boolean
        System.out.println("\nHashSet contains Raleigh or not: " + h.contains("Raleigh"));

        // Since HashSets do not have a fixed size, we must calculate its size using the method size();
        System.out.println("\nSize of the HastSet: " + h.size());

        // Remove items from HashSet
        h.remove("Seattle");
        h.remove("Portland"); // if item is not in HashSet, remove gets ignored
        System.out.println("\nHashSet with one Removed");

        // Iterate over HashMap to print
        // Iterator containes same element type as HashSet
        // DO NOT change HashSet during loop! It can cause issues
        Iterator<String> i = h.iterator();

        while (i.hasNext()) {
            String temp = i.next();
            System.out.println(temp);
        }

        // sort HashSet - convert to ArrayList first
        List<String> hlist = new ArrayList<>(h);

        System.out.println("\nThe Sorted HashSet");
        Collections.sort(hlist);
        System.out.println(hlist);

        // Clear HashSet
        h.clear();
        System.out.println("\nThe HashSet Cleared");
        System.out.println(h);
    }
}
package arrays;

import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("*** Array Example ***");

        // create an array [] that can hold 7 elements of type integer
        int[] ournums = new int[7];

        // initialize elements in array with random integer for each element
        for (int i = 0; i < 5; i++) {
            ournums[i] = rand.nextInt(10);
        }

        System.out.println("The third element of the array is " + ournums[2]);

        System.out.println();
        System.out.println("Print using a for each loop");
        // use for each loop
        for (int arrElement : ournums) {
            System.out.println("Item: " + arrElement);
        }
        
        System.out.println();
        System.out.println("Print using a regular for loop");
        for (int i = 0; i < ournums.length; i++) {
            System.out.println("Array Element " + i + " = " + ournums[i]);
        }

        System.out.println();
        System.out.println("*** Another Way Example ***");
        // initialize an array of strings using a list of values
        // the size of the array is set as the number of items in the list
        String[] cars = {"Volvo", "BMW", " Ford", "Mazda"};

        System.out.println(cars.length);
        System.out.println(cars[0]);

        // change 2nd element in array
        cars[1] = "Honda";

        // print array's pointer
        System.out.println(cars);

        System.out.println("Before sort Element index 2 " + cars[2]);

        // sort array in ascending order using Arrays class
        Arrays.sort(cars);
        System.out.println("After sort Element index 2 " + cars[2]);

        // sort array in descending order with Arrays & Collections
        Arrays.sort(cars, Collections.reverseOrder());

        System.out.println();
        System.out.println("Array in descending order");
        System.out.println(Arrays.toString(cars));
    }
}

/*
javac arrays/*.java
jar cvfe arrays.jar arrays.Main arrays/*.class
java -jar arrays.jar
*/
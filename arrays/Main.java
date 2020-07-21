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
    }
}

/*
javac arrays/*.java
jar cvfe arrays.jar arrays.Main arrays/*.class
java -jar arrays.jar
*/
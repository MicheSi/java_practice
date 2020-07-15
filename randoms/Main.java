package randoms;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        // create an object called rand which is of class type Random()
        // this object can be named anything but rand is commonly used
        // this objects contains a variety of methods to generate random numbers of all types

        Random rand = new Random();

        //  display values for min and max integer
        //  each primitive data type has an associated class type that contains various constants and methods
        //  use the constants in integer class to find min and max numbers
        System.out.println("min int " + Integer.MIN_VALUE);
        System.out.println("max int " + Integer.MAX_VALUE);

        // generate a random integer from min int through max int
        int iresult = rand.nextInt();
        System.out.println(iresult);

        // Pick number from 0, 1, 2, 3, 4
        //  the 5 as param says to pick from 5 numbers, starting with 0
        iresult = rand.nextInt(5);
        System.out.println(iresult);

        // pick a random double between 0.0 and 1.0
        // need a new variable since we're working with a diff data type
        double dresult = rand.nextDouble();
        System.out.println(dresult);
    }
}
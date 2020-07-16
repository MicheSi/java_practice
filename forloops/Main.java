package forloops;

public class Main {
    public static void main(String [] args) {
        System.out.println("*** Normal loop - Count 0 to 9 ***");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("*** change the index - Even Numbers between 1 and 10 n ***");

        for (int i = 1; i <= 10; i++) { // adds 1 to i each loop
            i++; // add 1 to i after each loop
            System.out.println(i);
        }

        System.out.println();
        System.out.println("*** change the step - odd numbers");
        for (int i = 1; i <= 10; i = i + 2) { // adds 2 to i each loop
            System.out.println(i);
        }

        // continue - everything stops and loop goes to next iteration
        System.out.println();
        System.out.println("*** continue - Ending does not print even numbers ***");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Beginning " + i);
            if ((i % 2) == 0) { // if i is evenly divided by 2, continue the loop. Does not get to println("Ending")
                continue;
            }
            System.out.println("Ending " + i);
        }

        // break - everything stops, loop ends without more interations
        System.out.println();
        System.out.println("*** break - Stops printing at 5 ***");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Beginning " + i);
            if (i >= 5) { // if i is larger than 5, the loop stops
                break;
            }
            System.out.println("Ending " + i);
        }
    }
}

/*
javac forloops/*.java
jar cvfe forloops.jar forloops.Main forloops/*.class
java -jar forloops.jar
*/

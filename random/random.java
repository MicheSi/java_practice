package randoms;

import java.util.Random;

public class Main
{
    public static void main(String args[])
    {
        Random rand = new Random();


        // generate a random integer from min int through max int
        int iresult = rand.nextInt();

        // Pick a number from 0, 1, 2, 3, 4
        // the 5 as the parameter below says to pick from the 5 numbers, starting with 0
        // here we are reusing the variable iresult. It has already been
        // declared so we can just use it.
        iresult = rand.nextInt(5);

        // Now let's pick a number from 5 to 10 by
        // picking from the 6 numbers starting with 0
        // 0, 1, 2, 3, 4, 5
        // now add 5 to that number. So possible choices are
        // 5, 6, 7, 9, 9, 10
        iresult = rand.nextInt(6) + 5;

        // pick a random double between 0.0 and 1.0
        // now we are working with a different data type, double,
        // so we need a new result variable.
        double dresult = rand.nextDouble();
    }
}

/* To run code:
javac scopes/*.java
jar cvfe scopes.jar scopes.Main scopes/*.class
java -jar scopes.jar
*/
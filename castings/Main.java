package castings;

public class Main {
    public static void main(String args[]) {
        int myInt = 9;
        // Widening casting is automaticall done. An int is automatically casted (converted) to a double
        double myDouble = myInt;

        // String conversion happens automatically, allowing us to print values of int, doubles, among others
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);

        // This displays a blank line
        System.out.println();

        double my2double = 9.78;
        // Narrowing casting must be done manually - add (int) in expression to convert the double to an int
        int my2int = (int) my2double;

        System.out.println("my2double = " + my2double);
        System.out.println("my2int = " + my2int);
    }
}

/* To run code:
javac castings/*.java
jar cvfe castings.jar castings.Main castings/*.class
java -jar castings.jar
*/
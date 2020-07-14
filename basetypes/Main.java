package basetypes;

public class Main {
    public static void main(String args[]) {
        // create some numbers to work with
        int a = 2;
        int b = 1;
        double ba = 11.5;

        // manipulate those numbers and output results
        // arithmetic includes +, -, *, /
        // the result of arithmetic on a double and integer results in double
        double result = ba / a;
        System.out.println(result); // displays 5.75

        // the results of arithmetic on an integer and an integer results in an integer
        System.out.println(b + a); // displays 3

        // integer / integer results in an integer, decimal part truncated
        System.out.println(b / a); // displays 0

        // the % returns the remainder of doing division
        System.out.println(b % a); // displays 1

        // Strings
        String sa = "Lambda";
        String sb = "School";

        // you can add strings
        String ans = sa + sb;
        System.out.println(ans); // display LambdaSchool

        // Java handles compound and increment operators
        a += b; // same as a = a + b
        System.out.println(a); // displays 3

        b++; // same as b = b + 1
        System.out.println(b); // displays 2
    }
}

/*
To run our code, we go through the following steps, running these commands from the src directory:

javac basetypes/*.java
jar cvfe basetypes.jar basetypes.Main basetypes/*.class
java -jar basetypes.jar
*/
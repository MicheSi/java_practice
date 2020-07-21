package lambdaexpress;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> filterOdds(List<Integer> myList, CheckNumber tester) {
        // When we call this, myList becomes numbers from the main method
        // tester becomes lamda expression num -> ((num % 2) == 0) where num is an element in ArrayList
        List<Integer> filteredList = new ArrayList<>();

        for (Integer n : myList) {
            // if lambda expression is true, add element to new ArrayList
            if (tester.test(n)) {
                filteredList.add(n);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();

        // populate an ArrayList with numbers 0-6
        for (int i = 0; i < 7; i++) {
            numbers.add(i);
        }

        // Create new ArrayList from output of function filterOdds with parameters - populated ArrayList & lambda expression
        List<Integer> toPrintList = filterOdds(numbers, num -> ((num % 2) == 0));
        toPrintList.forEach(n -> System.out.println(n));
    }
}

/*
javac lambdaexpress/*.java
jar cvfe lambdaexpress.jar lambdaexpress.Main lambdaexpress/*.class
java -jar lambdaexpress.jar
*/
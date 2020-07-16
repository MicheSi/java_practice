package workingdates;

// import 2 libraries .util to work with dates, .text to work with date output
import java.util.*;

import java.text.*;

public class Main {
    // create format to use when displaying dates
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy hh:mm:ss a z Z");
    // create simpler format to use when creating dates from strings
    private static SimpleDateFormat date2Format = new SimpleDateFormat("MMM dd yyyy hh:mm:ss");

    // add throws Exception to method - telling Java that a method inside our main method can throw an exception and disrupt normal flow of code
    public static void main(String args[]) throws Exception {
        // create object of type Date, initialized with current date and time
        Date myDate = new Date();
        System.out.println(dateFormat.format(myDate));

        // set date to a certain time using the parse method (says how to parse/convert a string)
        // if parsing fails, it throws an exception as specified in method's header
        Date thisDate = date2Format.parse("MAR 14 3141 03:14:15");
        System.out.println(dateFormat.format(thisDate));

        // add to date by creating a Calendar object
        // Constructors for Calendar are protected in library so we have to invoke the method getInstance to create a Calendar
        Calendar c = Calendar.getInstance();

        // set date of calendar object to starting date
        c.setTime(thisDate);
        // add 1 day to the calendar object
        c.add(Calendar.DATE, 1);
        // convert calendar object back to a date object
        thisDate = c.getTime();
        System.out.println(dateFormat.format(thisDate));
    }
    
}

/* To run code:
javac workingdates/*.java
jar cvfe workingdates.jar workingdates.Main workingdates/*.class
java -jar workingdates.jar
*/
package workingstrings;

// import needed to convert doubles to something readable
import java.text.DecimalFormat;

public class Main {
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public static void main(String arg[]) {
        String myStr = "Lambda School";

        // return first character in string
        myStr.charAt(0);

        System.out.println(myStr); // displays Lambda School
        System.out.println(myStr.charAt(0)); // displays L
        System.out.println(myStr.charAt(5)); // displays character at 5th index, a

        // find substring in myStr beginning at index 5 and ending at index 8
        String strResult = myStr.substring(5, 8);
        System.out.println(strResult); // displays "a S"

        // displays length of string
        System.out.println(myStr.length()); // displays 13

        // add name to myStr
        strResult = myStr + "Michelle";
        System.out.println(strResult); // displays Lambda SchoolMichelle

        strResult = myStr.toLowerCase();
        System.out.println(strResult); // displays lambda school

        strResult = myStr.toUpperCase();
        System.out.println(strResult); // displays LAMBDA SCHOOL

        // convert double to format when df was created using DecimalFormat
        double myDouble = 123134556.7890;
        strResult = df.format(myDouble);
        System.out.println(strResult); // displays $123,134,556.79

        myDouble = .3;
        strResult = df.format(myDouble);
        System.out.println(strResult); // displays $0.30
    }
}

/* To run code:
javac workingstrings/*.java
jar cvfe workingstrings.jar workingstrings.Main workingstrings/*.class
java -jar workingstrings.jar
*/
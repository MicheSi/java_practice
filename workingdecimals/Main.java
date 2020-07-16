package workingdecimals;

import java.math.BigDecimal;

public class Main {
    //  create 2 doubles so we can do some arthmetic
    static double aWholeNumber = 3;
    static double aRealNumber = 3.36;

    public static void main(String[] args) {
        // math operations + display results
        double answerMult = aRealNumber * aWholeNumber;
        double answerDiv = aRealNumber / aWholeNumber;
        double answerPlus = aRealNumber + aWholeNumber;
        double answerSub = aRealNumber - aWholeNumber;

        System.out.println("*** The Problem ***");
        System.out.println(aRealNumber + " * " + aWholeNumber + " = " + answerMult);
        System.out.println(aRealNumber + " / " + aWholeNumber + " = " + answerDiv);
        System.out.println(aRealNumber + " + " + aWholeNumber + " = " + answerPlus);
        System.out.println(aRealNumber + " - " + aWholeNumber + " = " + answerSub);

        // Rouding numbers
        System.out.println(); // this gives us a blank line
        System.out.println("*** Solution with Rounding ***"); // some headers to help read the output
        System.out.println("*** Must round each answer before using");

        double answerDivRound = Math.round(answerDiv * 100.0) / 100.0;
        double answerMultRound = Math.round(answerMult * 100.0) / 100.0;
        double answerPlusRound = Math.round(answerPlus * 100.0) / 100.0;
        double answerSubRound = Math.round(answerSub * 100.0) / 100.0;

        System.out.println(aRealNumber + " * " + aWholeNumber + " = Round to cents " + answerMultRound);
        System.out.println(aRealNumber + " / " + aWholeNumber + " = Round to cents " + answerDivRound);
        System.out.println(aRealNumber + " + " + aWholeNumber + " = Round to cents " + answerPlusRound);
        System.out.println(aRealNumber + " - " + aWholeNumber + " = Round to cents " + answerSubRound);

        // BigDecimals
        System.out.println();
        System.out.println("*** Solution with Big Decimals ***");

        // convert to BigDigDecimals
        BigDecimal bigARealNumber = BigDecimal.valueOf(aRealNumber);
        BigDecimal bigAWholeNumber = BigDecimal.valueOf(aWholeNumber);

        // now we call the appropriate methods to perform operations on BigDecimals
        BigDecimal bigAnswerMutl = bigARealNumber.multiply(bigAWholeNumber);
        BigDecimal bigAnswerDiv = bigARealNumber.divide(bigAWholeNumber);
        BigDecimal bigAnswerPlus = bigARealNumber.add(bigAWholeNumber);
        BigDecimal bigAnswerSub = bigARealNumber.subtract(bigAWholeNumber);

        System.out.println(bigARealNumber + " * " + bigAWholeNumber + " = " + bigAnswerMutl);
        System.out.println(bigARealNumber + " / " + bigAWholeNumber + " = " + bigAnswerDiv);
        System.out.println(bigARealNumber + " + " + bigAWholeNumber + " = " + bigAnswerPlus);
        System.out.println(bigARealNumber + " - " + bigAWholeNumber + " = " + bigAnswerSub);
    }
}

/*
javac workingdecimals/*.java
jar cvfe workingdecimals.jar workingdecimals.Main workingdecimals/*.class
java -jar workingdecimals.jar
*/
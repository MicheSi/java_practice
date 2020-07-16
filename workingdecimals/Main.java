package workingdecimals;

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
    }
}

/*
javac workingdecimals/*.java
jar cvfe workingdecimals.jar workingdecimals.Main workingdecimals/*.class
java -jar workingdecimals.jar
*/
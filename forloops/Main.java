package forloops;

public class Main {
    public static void main(String [] args) {
        System.out.println("*** Normal loop - Count 0 to 9 ***");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("*** change the index - Even Numbers between 1 and 10 n ***");

        for (int i = 1; i <= 10; i++) { 
            i++;
            System.out.println(i);
        }
    }
}

/*
javac forloops/*.java
jar cvfe forloops.jar forloops.Main forloops/*.class
java -jar forloops.jar
*/

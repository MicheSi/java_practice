package recursions;

public class Main {
    public static int fact(int n) {
        if (n == 1) { // base case
            return 1;
        } else {
            System.out.println(n + " * " + (n - 1) + "!");
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Factorial " + fact(5));
    }
}

// javac recursions/*.java
// jar cvfe recursions.jar recursions.Main recursions/*.class
// java -jar recursions.jar
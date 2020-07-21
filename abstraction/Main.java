package abstraction;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // create a pig object
        myPig.animalSound(); // use animalSound method from abstract class defined in Pig
        myPig.sleep(); // use sleep method from abstract class
        System.out.println("Weight " + myPig.getWeight()); // use getWeight method from abstract class
    }
}

/*
javac abstraction/*.java
jar cvfe abstraction.jar abstraction.Main abstraction/*.class
java -jar abstraction.jar
*/
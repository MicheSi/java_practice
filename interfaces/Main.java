package interfaces;

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // instantiate a pig object
        Dog2 myDog = new Dog2(); // instantiate a dog object

        myPig.animalSound();
        myPig.sleep();

        myDog.animalSound();
        myDog.sleep();
        myDog.eat();
    }
}

/*
javac interfaces/*.java
jar cvfe interfaces.jar interfaces.Main interfaces/*.class
java -jar interfaces.jar
*/
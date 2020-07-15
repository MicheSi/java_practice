package dogs;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.bark); // displays Woof

        Dog dottie;
        dottie = new Dog("Springer", 10, "Black and White");
        Dog ginger = new Dog("Troller", 6, "Ginger");
        dottie.bark = "Bark";
        System.out.println(dottie.bark); // displays Bark

        System.out.println(dottie); // displays dogs.Dog@1517365b
        System.out.println(dottie.getAge()); // displays 10

        ginger.setBreed("mutt");
        System.out.println(ginger.getBreed()); // displays mutt

        Dog limited = new Dog("Black");
        System.out.println(limited.getAge()); // displays 1

        Dog aDog = new Dog();
        System.out.println(aDog.getBreed()); // displays null
        aDog.setBreed("Beagles");
        System.out.println(aDog.getBreed()); // displays Beagles
    }
}

/*
javac dogs/*.java
jar cvfe dogs.jar dogs.Main dogs/*.class
java -jar dogs.jar
*/
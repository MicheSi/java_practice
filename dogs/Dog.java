package dogs;

import jdk.internal.agent.resources.agent;

public class Dog {
    // class field
    public static String bark = "Woof";

    // fields
    private String breed;
    private int age;
    private String color;

    // default constructor
    public Dog() {

    }

    // constructor with limited initial state
    public Dog(String color) {

    }

    // constructor with initial state
    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // reads state.accessors (getters)
    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // change state.mutators (setters)
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // other methods
    public void sleep(int minutes) {
        System.out.println("ZZZ " + minutes);
    }
}
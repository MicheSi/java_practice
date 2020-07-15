package dogs;

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
    public Dog(final String color) {
        this.breed = "mutt";
        this.age = 1;
        this.color = color;
    }

    // constructor with initial state
    public Dog(final String breed, final int age, final String color) {
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
    public void setBreed(final String breed) {
        this.breed = breed;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    // other methods
    public void sleep(final int minutes) {
        System.out.println("ZZZ " + minutes);
    }
}
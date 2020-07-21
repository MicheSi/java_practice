package abstraction;

abstract class Animal {
    int weight = 50;

    abstract void animalSound();

    void sleep() {
        System.out.println("ZZZ");
    }

    int getWeight() {
        return weight;
    }
}
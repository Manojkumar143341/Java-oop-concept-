// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bruno", 3);
        myDog.makeSound();
        myDog.displayInfo();
    }
}

// Base class
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Polymorphism: Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class using Inheritance
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // calling superclass constructor
    }

    // Overriding method (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    // Display dog info
    public void displayInfo() {
        System.out.println("Dog's Name: " + getName());
        System.out.println("Dog's Age: " + getAge());
    }
}

// superclass Animal
public class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Demonstrate method overriding
        animal.makeSound(); // Calls the makeSound() method of Animal
        dog.makeSound();    // Calls the overridden makeSound() method of Dog
        cat.makeSound();    // Calls the overridden makeSound() method of Cat
    }
}

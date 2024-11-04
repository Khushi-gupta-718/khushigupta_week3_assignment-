// Define an interface
interface Pet {
    void play();
}

// Define an abstract class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("The animal is sleeping.");
    }
}

// Dog class that extends Animal and implements Pet
class Dog extends Animal implements Pet {
    
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}

// Cat class that extends Animal and implements Pet
class Cat extends Animal implements Pet {
    
    void makeSound() {
        System.out.println("Meow! Meow!");
    }

    
    public void play() {
        System.out.println("The cat is playing with a ball of yarn.");
    }
}


public class AbstractInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
        dog.play();

        System.out.println();

        Cat cat = new Cat();
        cat.makeSound();
        cat.sleep();
        cat.play();
    }
}

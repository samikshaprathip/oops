package introduction;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismDemo {

    public static void main(String[] args) {

        Animal animal;   // Parent class reference

        animal = new Dog();   // Dog object
        animal.sound();       // Calls Dog's sound()

        animal = new Cat();   // Cat object
        animal.sound();       // Calls Cat's sound()
    }
}

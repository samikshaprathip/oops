// Superclass (Parent class)
class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (Child class)
class Dog extends Animals {
    void bark() {
        System.out.println("The dog barks.");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        // Create object of Dog
        Dog myDog = new Dog();

        // Access method of superclass
        myDog.eat();   // inherited from Animal

        // Access method of subclass
        myDog.bark();  // defined in Dog
    }
}


// Superclass (Parent class)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Subclass 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Subclass 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Object of Car
        Car myCar = new Car();
        myCar.start();  // inherited from Vehicle
        myCar.drive();  // own method

        System.out.println();

        // Object of Bike
        Bike myBike = new Bike();
        myBike.start();  // inherited from Vehicle
        myBike.ride();   // own method
    }
}

// Superclass (Parent class)
class Electronics {
    void powerOn() {
        System.out.println("Electronics device is powered on.");
    }
}

// Subclass (Child class of Electronics)
class Computer extends Electronics {
    void compute() {
        System.out.println("Computer is processing data.");
    }
}

// Sub-subclass (Child class of Computer)
class Laptop extends Computer {
    void portable() {
        System.out.println("Laptop is portable and can run on battery.");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.powerOn();    // from Electronics
        myLaptop.compute();    // from Computer
        myLaptop.portable();   // from Laptop
    }
}


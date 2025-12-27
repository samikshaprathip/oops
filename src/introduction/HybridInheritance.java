// Superclass
class Appliance {
    void powerOn() {
        System.out.println("Appliance is powered on.");
    }
}

// Subclass 1 (part of hierarchical inheritance)
class Washer extends Appliance {
    void washClothes() {
        System.out.println("Washer is washing clothes.");
    }
}

// Subclass 2 (part of hierarchical inheritance)
class Dryer extends Appliance {
    void dryClothes() {
        System.out.println("Dryer is drying clothes.");
    }
}

// Interface (to demonstrate multiple inheritance part)
interface SmartFeature {
    void connectWifi();
}

// Sub-subclass (multilevel + interface, hybrid inheritance)
class SmartWasher extends Washer implements SmartFeature {
    public void connectWifi() {
        System.out.println("SmartWasher connected to Wi-Fi.");
    }
}


public class HybridInheritance {
    public static void main(String[] args) {

        Washer myWasher = new Washer();
        myWasher.powerOn();
        myWasher.washClothes();

        System.out.println();

        Dryer myDryer = new Dryer();
        myDryer.powerOn();
        myDryer.dryClothes();

        System.out.println();

        SmartWasher smartWasher = new SmartWasher();
        smartWasher.powerOn();      // from Appliance
        smartWasher.washClothes();  // from Washer
        smartWasher.connectWifi();  // from SmartFeature
    }
}

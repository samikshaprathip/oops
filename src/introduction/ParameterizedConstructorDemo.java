class Learner {
    String name;
    int age;
    String track;

    // Parameterized constructor
    Learner(String name, int age, String track) {
        this.name = name;
        this.age = age;
        this.track = track;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Track: " + track);
        System.out.println("----------------------");
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {

        Learner l1 = new Learner("Samiksha", 20, "Java OOPS");
        Learner l2 = new Learner("Alex", 22, "DSA");

        l1.displayInfo();
        l2.displayInfo();
    }
}


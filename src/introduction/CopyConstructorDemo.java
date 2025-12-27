class Learners {
    String name;
    int age;
    String course;

    // Parameterized constructor
    Learners(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Copy constructor
    Learners(Learners other) {
        this.name = other.name;
        this.age = other.age;
        this.course = other.course;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}

public class CopyConstructorDemo {
    public static void main(String[] args) {

        // Original object
        Learners l1 = new Learners("Samiksha", 20, "Java OOPS");

        // Copying object
        Learners l2 = new Learners(l1);

        l1.displayInfo();
        l2.displayInfo();
    }
}

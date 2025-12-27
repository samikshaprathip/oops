class Students {
    String name;
    int age;
    String course;

    // Non-parameterized constructor
    Students() {
        name = "Samiksha";
        age = 20;
        course = "Java OOPS";
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("---------------------");
    }
}

public class NonParameterizedConstructorDemo {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.displayInfo();
    }
}


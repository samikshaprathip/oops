class Student{
    String name;
    int age;
    String course;

    Student(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("------------------------");
    }
}

public class Main{
    public static void main(String[] args){
        Student s1=new Student("sam",20,"computer Science");
        Student s2=new Student("Priya",19,"Biology");
        s1.displayInfo();
        s2.displayInfo();
    }
}
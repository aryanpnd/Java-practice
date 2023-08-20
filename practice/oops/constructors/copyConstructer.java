package constructors;
class Student {
    String name;
    int age;

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }

    void printDetails() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }
}

public class copyConstructer {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aryan";
        student1.age = 18;


        Student student2 = new Student(student1);
        student2.printDetails();
    }
}

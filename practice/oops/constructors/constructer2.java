package constructors;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }
}

public class constructer2 {
    public static void main(String[] args) {
        Student st = new Student("Aryan", 18);
        st.printDetails();
    }
}

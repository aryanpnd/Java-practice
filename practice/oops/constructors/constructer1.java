package constructors;
class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor called");
    }
}

public class constructer1 {
    public static void main(String[] args) {
        Student st = new Student();
    }
}

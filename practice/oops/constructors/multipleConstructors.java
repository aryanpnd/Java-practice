class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor called");
    }
    Student(String name){
        this.name = name;
        System.out.println("Student name : "+this.name);
    }
    Student(int age){
        this.age = age;
        System.out.println("Student age : "+this.age);
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student details : ");
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class multipleConstructors {
    public static void main(String[] args) {
        // method I
        // Student st = new Student();

        // method II
        // Student st = new Student(18);
        // Student st2 = new Student("Aryan");
        
        // method III
        Student st = new Student("Aryan",18);

        
        
    }
}

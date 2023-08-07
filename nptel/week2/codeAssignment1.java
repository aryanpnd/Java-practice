/*
Complete the code segment to call the method  print() of class Student first and then call print() method of class School.
 */
class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}

// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class codeAssignment1 {
    public static void main(String[] args) {
        // Create an object of class Student
        Student st = new Student();
        // Call 'print()' method of class Student
        st.print();
        // Create an object of class School
        School sc = new School();
        // Call 'print()' method of class School
        sc.print();
    }
}

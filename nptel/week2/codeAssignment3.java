/*
 Complete the code segment to call print() method of class codeAssignment3 by creating a method named ‘studentMethod()’.
 */

public class codeAssignment3 {
    public static void main(String[] args) {
        // Object of the main class is created
        codeAssignment3 q = new codeAssignment3();
        // Print method on object of codeAssignment3 class is called
        q.studentMethod();
    }

    // 'print()' method is defined in class codeAssignment3
    void print(codeAssignment3 object) {
        System.out.print("Well Done!");
    }

    // Define a method named 'studentMethod()' in class codeAssignment3
    // Call the method named 'print()' in class codeAssignment3
    void studentMethod(){
        print(this);
        // The this keyword is used to refer to the current object (codeAssignment3 instance) inside the class. The print(this) line will call the print() method with the current object as an argument, which will print "Well Done!" as specified in the print() method implementation.
    }
    
}

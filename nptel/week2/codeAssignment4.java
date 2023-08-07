/*
Complete the code segment to call default constructor first and then any other constructor in the class.
 */

public class codeAssignment4 {
    public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer{
	Answer(){
		System.out.println("You got nothing.");
	}
	Answer(int marks, String type){		
        this();
		System.out.println("You got "+marks+" for an "+ type);
	}
}


// In Java, to call a constructor from another constructor in the same class, you can use the this() keyword

// In this code, the parameterized constructor of the Answer class calls the default constructor using this().
//  This ensures that the default constructor logic is executed before the parameterized constructor logic.
//  When you run the main method, you'll see the 

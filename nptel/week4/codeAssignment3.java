/*
The program in this assignment is attempted to print the following output: 

-----------------OUTPUT-------------------
This is large
This is medium
This is small
This is extra-large
-------------------------------------------------

However, the code is intentionally injected with some bugs. Debug the code to execute the program successfully.

 */

/*
interface ExtraLarge{
	String extra = "This is extra-large";
	public static void display();
}

class Large {
    public void Print() {
        System.out.println("This is large")
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); ; 
        System.out.println("This is small");
    }
  }
}
 
class Question43{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
	  Question43 q = new Question43();
	  q.display();
    }
}
*/

interface ExtraLarge{
	 String extra = "This is extra-large";
  public void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); 
        System.out.println("This is small");
    }
  }

 
class Question43 implements ExtraLarge{
  public void display(){
   	System.out.print(ExtraLarge.extra); 
  }
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
      
       Question43 q = new Question43();
	   q.display();
	  
    }
}
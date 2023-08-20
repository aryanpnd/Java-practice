abstract class Animal{
    Animal(){
        System.out.println("This animal");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class program1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}

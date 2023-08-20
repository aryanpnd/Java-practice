interface Animal{
    public void walk();
}
interface Herbivore{
    String eats = "grass";
    void eat();
}

class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("eats "+ eats);
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
    }    
}

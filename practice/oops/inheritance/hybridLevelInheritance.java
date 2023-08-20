class Shape{
    public void area(){
        System.out.println("Display area : ");
    } 
}

// single level inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

// as well as multi level inheritance 
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class hybridLevelInheritance {
    public static void main(String[] args) {
        
    }
}

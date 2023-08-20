class Shape{
    String color;
}

class Triangle extends Shape{
    void printShapeColor(){
        System.out.println(this.color);
    }
}


public class program1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "red";
        t.printShapeColor();
    }
}

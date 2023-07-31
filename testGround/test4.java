import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        perimeter = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        System.out.println(perimeter);
        System.out.println(area);
    }
}

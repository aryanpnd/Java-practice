import java.util.*;

public class test4 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first num : ");
    double a = sc.nextDouble();
    System.out.println("Enter the Second num : ");
    double b = sc.nextDouble();
    System.out.println("Enter the operation : ");
    char c = sc.next().charAt(0);

    double result =(c == '+') ? a + b :
    (c == '-') ? a - b :
    (c == '*') ? a * b :
    (c == '/' && b != 0) ? a / b :
    (c == '/' && b == 0) ? -1:-1;

    System.out.println(result);
    sc.close();
     

}
}
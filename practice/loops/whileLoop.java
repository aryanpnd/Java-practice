import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("the number of which you want to print table : ");
        int num = sc.nextInt();
        sc.close();

        int i = 0;

        while (i < 11) {
            System.out.println(num + "x" + i + " = " + num * i);
            i++;
        }
    }
}

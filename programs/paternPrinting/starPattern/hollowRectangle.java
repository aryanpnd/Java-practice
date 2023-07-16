package starPattern;
import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1 || i==num || j==num)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
}

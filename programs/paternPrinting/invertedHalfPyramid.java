import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = num; i >= 1; i--) {
            for (int j = 0; j <= num; j++) {
                if (i > j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

        // or

        for (int i = num; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        System.out.print("* ");
        }
        System.out.println("");
        }
    }
}

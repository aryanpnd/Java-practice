import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner uc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = uc.nextInt();
        uc.close();

        for (int i = 1; i <= num; i++) { 
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (num-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) { 
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (num-i);
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package starPattern;
import java.util.Scanner;

class inverseHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j<=num-i;j++){
                System.out.print(' ');
            }
            for(int j = 1; j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
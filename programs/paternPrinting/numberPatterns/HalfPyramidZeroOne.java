import java.util.Scanner;

public class HalfPyramidZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int temp = 0;

        // 01
        // 0101
        // 010101
        // 01010101
        // doesn't change value in new row

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (temp % 2 == 0) {
                    System.out.print(0);
                    temp++;
                } else {
                    System.out.print(1);
                    temp++;
                }
            }
            System.out.println();
        }

        // 01
        // 1010
        // 010101
        // 10101010
        // changes value in new row

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}

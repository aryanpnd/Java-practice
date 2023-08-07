/*
Complete the code segment to check whether the number is an Armstrong number or not.

Armstrong Number:

A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc
 */

import java.util.Scanner;

public class codeAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        int orignalNumber = n;
        int numberLength = 0;
        int sum = 0;

        while (n != 0) {
            n = n / 10;
            numberLength++;
        }

        n = orignalNumber;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberLength);
            n /= 10;
        }

        if (sum == orignalNumber)
            System.out.print(1);
        else
            System.out.print(0);

    }
}

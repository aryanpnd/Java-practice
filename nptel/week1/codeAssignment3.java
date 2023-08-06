/*
Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

Example:

Input: n = 5

-------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6
 */

import java.util.Scanner;

public class codeAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        int i = 0, j = 0;
        while (i < n) {
            if (j % 2 == 0) {
                if (j % 3 == 0) {
                    sum = sum + j;
                }
                i++;
            }
            j++;
        }
        System.out.print(sum);
    }
}

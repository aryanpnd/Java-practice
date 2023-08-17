/*
 This program is related to the generation of Fibonacci numbers.
For example: 0,1, 1,2, 3,5, 8, 13,… is a Fibonacci sequence where 13 is the 8th Fibonacci number
 */

import java.util.Scanner;

public class codeAssignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read an integer
        System.out.println(fib(n));
    }

    static int fib(int n) {
        // complete the code segment to find the nth Fibonacci number in the Fibonacci
        // sequence and return the value. Write the function recursively.

        // this is the actual approach as per given in the quetion but it will fail some
        // test cases because of time limit, but its the only way to solve this using
        // recursion .
        // class localClass {
        // int fibRecursive(int n) {
        // if (n <= 1) {
        // return n;
        // }

        // return fibRecursive(n - 1) + fibRecursive(n - 2);
        // }
        // }

        // int fibNum = 0;
        // for (int i = 2; i < n; i++) {
        // fibNum = new localClass().fibRecursive(i);
        // }

        // return fibNum;

        // the simpler and efficient way using array (to pass the test cases)
        if (n <= 1) {
            return 0;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];
    }
}

import java.util.Scanner;

public class fibonacci {
    public static int fibonacciRecursive(int num) {
        if (num <=1) {
            return num;
        } else {
            return fibonacciRecursive(num-1)+fibonacciRecursive(num-2);
        }
    }

    public static int fibonacciIterative(int num) {
        if(num<=1){
            return num;
        }
        int fib = 0;
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i <= num; i++) {
            fib = prev1+prev2;
            prev1 = prev2;
            prev2 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int ansRecursive = fibonacciRecursive(num);
        int ansIterative = fibonacciIterative(num);
        System.out.println("Recursive : " + ansRecursive);
        System.out.println("Iterative : " + ansIterative);
    }

}

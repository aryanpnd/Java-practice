import java.util.Scanner;

public class factorialRecursion {
    public static int factorialRecursive(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorialRecursive(num - 1);
        }
    }

    public static int factorialIterative(int num) {
        int temp = 1;
        for (int i = 2; i <= num; i++) {
            // temp*=i;
            // or
            temp = temp * i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int ansRecursive = factorialRecursive(num);
        int ansIterative = factorialIterative(num);
        System.out.println("Recursive : "+ansRecursive);
        System.out.println("Iterative : "+ansIterative);
    }
}

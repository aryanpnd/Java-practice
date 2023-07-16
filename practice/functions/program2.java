import java.util.Scanner;

public class program2 {
    public static String oddOrEven(int num) {
        String ans;
        ans = num % 2 == 0 ? "even" : "odd";
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a;
        int num = sc.nextInt();
        sc.close();
        String ans = oddOrEven(num);
        System.out.println("its "+ans);
    }
}

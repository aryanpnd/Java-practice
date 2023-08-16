import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num+1; i++) {
            if(i%15==0){
                System.out.println("Fizz Buzz");
                continue;
            }
            if (i%5==0) {
                System.out.println("Buzz");
                continue;
            }
            if (i%3==0) {
                System.out.println("Fizz");
                continue;
            }

            System.out.println(i);
        }
    }
}

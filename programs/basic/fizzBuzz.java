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

        System.out.println("--------------------------------------\n\n");
        int j = 0;
        while (j++<num) {
            if(j%15==0){
                System.out.println("Fizz Buzz");
                continue;
            }
            if (j%5==0) {
                System.out.println("Buzz");
                continue;
            }
            if (j%3==0) {
                System.out.println("Fizz");
                continue;
            }

            System.out.println(j);
        }
    }
}

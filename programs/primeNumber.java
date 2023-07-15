import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner uc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = uc.nextInt();
        uc.close();

        long startTime = System.currentTimeMillis();

        int temp = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                temp++;
            }
        }
        if (temp > 1)
            System.out.println("Its a Composite number");
        else
            System.out.println("Its a Prime number");

        long endTime = System.currentTimeMillis();

        // Calculate the elapsed time in milliseconds
        long elapsedTime = endTime - startTime;

        // Print the runtime
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}

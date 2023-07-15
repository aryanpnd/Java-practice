import java.util.Scanner;

public class firstNnaturalNumbersSum {
    public static void main(String[] args){
           Scanner uc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = uc.nextInt();
        uc.close();

        int temp=0;

        for (int i = 0; i <= num; i++) {
            temp+=i;
        }
        System.out.println("The sum of all natural numbers from 0 till "+num + " is "+temp);
    }
}

import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

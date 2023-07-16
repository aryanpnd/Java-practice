import java.util.Scanner;

public class halfNumberIncreasingPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        
        int temp = 0;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= i; j++) {
                temp++;
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}

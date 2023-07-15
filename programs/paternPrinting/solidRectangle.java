import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}

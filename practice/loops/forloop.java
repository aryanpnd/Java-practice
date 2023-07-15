import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner uc = new Scanner(System.in);

        System.out.print("the number of which you want to print table : ");
        int num = uc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(num + "x" + i + " = " + num * i);
        }
    }
}

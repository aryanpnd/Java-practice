import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set array size : ");
        int arrSize = sc.nextInt();
        int[] marks = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter Value at " + i + "th" + " position : ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Value at " + i + "th" + " position : " + marks[i]);
        }

    }
}

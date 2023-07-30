import java.util.Scanner;

public class updateBit {
    public static int clearBit(int n, int p) {
        int bitMask = 1 << p;
        int bitMaskNOT = ~(bitMask);
        return (bitMaskNOT & n);
    }

    public static int setBit(int n, int p) {
        int bitMask = 1 << p;
        return (bitMask | n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the position : ");
        int position = sc.nextInt();
        System.out.print("Enter 1 for set and 0 for clear : ");
        int cmd = sc.nextInt();

        int output = cmd == 1 ? setBit(number, position) : clearBit(number, position);
        System.out.println(output);
    }
}

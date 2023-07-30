import java.util.Scanner;

public class toggleBit {
    public static int getBit(int n, int p){
        int bitMask = 1<<p;
        return (bitMask&n);
    }

    public static int clearBit(int n, int p) {
        int bitMask = 1 << p;
        int bitMaskNOT = ~(bitMask);
        return (bitMaskNOT & n);
    }

    public static int setBit(int n, int p) {
        int bitMask = 1 << p;
        return (bitMask | n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the position : ");
        int position = sc.nextInt();
        
        int getBit = getBit(number, position);
        if (getBit==1) {
            System.out.println(setBit(number, position));
        } else {
            System.out.println(clearBit(number, position));
        }
    }
}

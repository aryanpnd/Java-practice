public class clearBit {
    public static void main(String[] args) {
        int number = 5;
        int position = 2;
        int bitMask = 1<<position;
        int bitMaskNOT = ~(bitMask);
        int newNum = number&bitMaskNOT;
        System.out.println(newNum);
    }    
}

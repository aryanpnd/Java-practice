public class setBit {
    public static void main(String[] args){
        // this will set 0 to 1 but 1 will be remain same, (no toggle)
        int number = 5;
        int position = 2;
        int bitMask = 1<<position;
        int newNum = number | bitMask;
        System.out.println(newNum);
    }
}

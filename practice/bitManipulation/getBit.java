public class getBit {
    public static void main(String[] args) {
        int number = 3; // binary will be 0100
        int position = 2; // position at binary , eg: 0100 at position 2 = 1
        int bitMask = 1<<position;
        if((bitMask&number)==0){
            System.out.println("The bit was 0");
        }else System.out.println("The bit was 1");
    }
}

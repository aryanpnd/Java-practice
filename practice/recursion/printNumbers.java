public class printNumbers {
    public static void printNumbersRecursively(int current, int end){
        if(current > end){
            return;
        }
        System.out.println(current);
        printNumbersRecursively(current + 1, end);
    }
    public static void printNumbersRecursivelyReverse(int num){
        if(num<=0){
            return;
        }
        System.out.println(num);
        printNumbersRecursivelyReverse(num-1);
    }
    public static void main(String[] args){
        printNumbersRecursively(0,5);
        printNumbersRecursivelyReverse(5);
    }    
}

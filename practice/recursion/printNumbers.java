public class printNumbers {
    public static void printNumbersRecursively(int num){
        if(num<=0){
            return;
        }
        System.out.println(num);
        printNumbersRecursively(num-1);
    }
    public static void main(String[] args){
        printNumbersRecursively(5);
    }    
}

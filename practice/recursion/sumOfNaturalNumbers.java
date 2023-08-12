public class sumOfNaturalNumbers {
    public static int printSumOfNaturalNumbers(int num){
        if(num<0){
            return 0;
        }
        return num+printSumOfNaturalNumbers(num-1);
    }
    public static void main(String[] args) {
        System.out.println(printSumOfNaturalNumbers(5));
    }
}

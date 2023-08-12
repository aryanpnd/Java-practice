public class fibonacci {

    public static int printFibonacci(int num){
        if(num==0 || num==1){
            return num;
        }
        return printFibonacci(num-1) + printFibonacci(num-2);
    }
    public static void main(String[] args) {
        System.out.println(printFibonacci(20));
    }
}

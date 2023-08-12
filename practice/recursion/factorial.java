public class factorial {
    public static int printFactorial(int num){
        if(num==0 || num==1){
            return 1; 
        }
        return printFactorial(num-1) * num;
    }
    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }
}

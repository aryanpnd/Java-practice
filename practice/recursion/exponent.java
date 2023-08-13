public class exponent {

    // time complexity of O(n)
    public static int printExponent(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int temp = printExponent(x, n-1);
        int xToN = x*temp;
        return xToN;
    }

    // time complexity of O(logn)
    public static int printExponent_Optimized(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        int temp = printExponent_Optimized(x, n/2);
        if(n%2==0){
            return temp * temp;
        }else{
            return temp*temp*x;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(printExponent_Optimized(2, 3));
    }       
}

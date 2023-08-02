class factorial {
    public static int factorial(int num){
        if(num==0 || num == 1){
            return num;
        }else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

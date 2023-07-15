// Program for finding prime number with time complexity O(sqrt(n))

public class test2 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        int number = 4542355; 

        long startTime = System.currentTimeMillis();
        boolean isNumberPrime = isPrime(number);
        System.out.println(number + " is prime: " + isNumberPrime);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    
    }
}

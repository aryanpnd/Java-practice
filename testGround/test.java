import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        int i= 0,j=0;
        while (i<n) {
            if(j%2==0){
                if (j%3==0) {
                    sum=sum+j;
                }
                i++;
            }
            j++;
        }
        System.out.println(sum);
    }
}

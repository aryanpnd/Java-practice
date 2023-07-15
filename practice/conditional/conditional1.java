import java.util.Scanner;

public class conditional1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age>18) {
            System.out.println("hey "+name+"! Your eligible to vote.");
        }else System.out.println("Sorry "+name+" you should be greater than 18 to vote");
    }
}

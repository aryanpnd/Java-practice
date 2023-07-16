import java.util.Scanner;

public class program1 {
    public static void printMyname(String name){
        System.out.print(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        sc.close();
        printMyname(name);
    }
}

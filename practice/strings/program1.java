import java.util.Scanner;

public class program1 {
    public static void main(String[] args){
        String greetingMessageString  = "hello!";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(greetingMessageString+" "+name);
    }
}

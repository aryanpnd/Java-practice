import java.util.Scanner;

// we cannot name a file as "Switch"
public abstract class switchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Hey!");
                break;
            case 2:
                System.out.println("Hey! There");
                break;
            case 3:
                System.out.println("Hey! wassup");
                break;
        
            default:
                System.out.println("Bye");
                 
        }
    }
    }

import java.io.File;
import java.util.Scanner;

public class readingFile {
 public static void main(String[] args) {
    try {
            File obj = new File("./dummyFiles/dummy1.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            
        } catch (Exception e) {
            System.out.println("error occured");
        }
 }   
}

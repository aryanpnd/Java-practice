import java.io.File;
import java.io.IOException;

public class creatingFile {
    public static void main(String[] args) {
        try {
            File obj = new File("./dummyFiles/dummy1.txt");
            if(obj.createNewFile()){
                System.out.println("file Created");
            }else{
                System.out.println("file exists");
            }
            
        } catch (Exception e) {
            System.out.println("error occured");
        }
    }
}

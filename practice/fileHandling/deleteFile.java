import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        try {
            File obj = new File("./dummyFiles/dummy1.txt");
            if (obj.delete()) {
                System.out.println(obj.getName()+" deleted");
            }else{
                System.out.println("Unable to delete "+obj.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

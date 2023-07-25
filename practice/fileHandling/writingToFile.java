import java.io.FileWriter;

public class writingToFile {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("./dummyFiles/dummy1.txt",true);
            Writer.write("hello world \n");
            Writer.close(); // we have to close the file .
            System.out.println("Written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

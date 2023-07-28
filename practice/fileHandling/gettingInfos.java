import java.io.File;

public class gettingInfos {
    public static void main(String[] args) {
        try {
            File path = new File("./dummyFiles");
            
            System.out.println("Directory info---");
            System.out.println(path.toPath());
            System.out.println(path.getAbsolutePath());
            System.out.println(path.getName());
            System.out.println(path.getParentFile());
            System.out.println(path.getFreeSpace());
            System.out.println(path.isAbsolute());
            System.out.println(path.isDirectory());
            System.out.println(path.listFiles()[0].getName());

        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}

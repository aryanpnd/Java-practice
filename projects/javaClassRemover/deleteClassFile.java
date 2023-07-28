import java.io.File;

public class deleteClassFile {
    public static void main(String[] args) {
        File obj = new File("./");
        File[] filesArray = obj.listFiles();
        int fileCount = 0;
        if(filesArray!=null){
        for (File file : filesArray) {
            if(file.getName().endsWith(".class")){
                file.delete();
                fileCount++;
            }
        }    
        }
        System.out.println("Total number .class files deleted: "+fileCount);
    }
}

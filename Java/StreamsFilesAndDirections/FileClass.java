import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClass {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        File f = new File("F:\\1.1_Java Advanced - may 2019\\L09 STREAMS, FILES AND DIRECTORIES\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] allFiles = f.listFiles();

        if(allFiles == null) return;

        for (File f1 : allFiles){
            if(!f1.isDirectory()){
                System.out.println(String
                        .format("%s: [%d]",f1.getName(),f1.length()));
            }
        }
    }
}

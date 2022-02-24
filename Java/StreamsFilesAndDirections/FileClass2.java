import java.io.File;

public class FileClass2 {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        File f = new File("F:\\1.1_Java Advanced - may 2019\\L09 STREAMS, FILES AND DIRECTORIES\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        DFS(f);

    }

    static void DFS(File root) {

        if(root == null) return;

        File[] files = root.listFiles();
        if(files == null) return;

        for (File file : files){
            if (file.isDirectory()) {
                System.out.println("DIR: " + file.getName());
                DFS(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }
}

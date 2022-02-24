import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(path))){
            String line = reader.readLine();
            int i = 1;
            while (line != null){

                System.out.println(i++ + ". " + line);
                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

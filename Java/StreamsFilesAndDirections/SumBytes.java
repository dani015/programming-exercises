import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";
        long sum = 0;
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(path))){
            String line = reader.readLine();
            while (line != null){
                for (char c : line.toCharArray()){
                    sum += c;
                }


                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}

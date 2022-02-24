import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextToBinary {
    public static void main(String[] args) throws FileNotFoundException {
        String userDir = System.getProperty("user.dir");

        String path = userDir + "/res/input.txt";

        try(FileInputStream fis = new FileInputStream(path)) {

            int oneByte = fis.read();
            while (oneByte >= 0){
                String res = Integer.toBinaryString(oneByte);
                System.out.println(res + " ");
                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

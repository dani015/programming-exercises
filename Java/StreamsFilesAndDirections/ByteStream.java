import java.io.*;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");

        String pathIn = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/output.txt";

        try (FileReader fis = new FileReader(pathIn);
             FileWriter fos = new FileWriter(pathOut)) {
            int oneByte = fis.read();

            while (oneByte >= 0) {
                if(oneByte == 32 || oneByte == 10){
                    fos.write(oneByte);
                } else {
                    String byteAsText = String.valueOf(oneByte);
                    for (int i = 0; i < byteAsText.length(); i++) {
                        int symbol = byteAsText.charAt(i);
                        fos.write(symbol);
                    }
                }
                oneByte = fis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

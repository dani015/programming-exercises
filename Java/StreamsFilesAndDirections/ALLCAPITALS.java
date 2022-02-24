import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/output.txt";
        char CharCounter = 0;
        BufferedReader reader = (new BufferedReader(new FileReader(path)));
        PrintWriter out = (new PrintWriter(new FileWriter(pathOut)));

        int ch;

        while ((ch = reader.read()) != -1){

            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);

            }
            out.write(ch);

        }
        reader.close();
        out.close();

    }
}

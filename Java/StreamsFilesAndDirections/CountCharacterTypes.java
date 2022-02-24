import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/input.txt";
        String pathOut = userDir + "/res/output.txt";

        String text = Files.readString(Path.of(path)).replaceAll("\r\n", " ");

        int[] countData = new int[3];

        String vowels = "aeiou";

        String ponctuation = "!,.?";

        for (char c : text.toCharArray()){
            if(vowels.contains(c + "")) {
                countData[0]++;
            }else if(ponctuation.contains(c + "")){
                countData[2]++;
            }else if(c != ' '){
                countData[1]++;
            }
        }
        PrintWriter writer = new PrintWriter(new FileWriter(pathOut));

        writer.printf("Vowels: %d\n" +
                "Consonants: %d\n" +
                "Punctuation: %d\n", countData[0], countData[1], countData[2]);


        writer.close();
    }
}

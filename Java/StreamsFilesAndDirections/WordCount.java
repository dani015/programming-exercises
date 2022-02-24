import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    private static final Pattern WORD_PATTERN = Pattern.compile("[\\w']+");

    private static Map<String, Integer> load(final String f1) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(f1));
        Map<String, Integer> out = new HashMap<String, Integer>();
        while (reader.hasNext()) {
            String tempLine = reader.nextLine();
            if (tempLine != null && tempLine.trim().length() > 0) {
                Matcher matcher = WORD_PATTERN.matcher(tempLine);
                while (matcher.find()) {
                    out.put(matcher.group().toLowerCase(), 0);
                }
            }
        }

        return out;
    }

    private static void write(final Map<String, Integer> out, final String fname) throws IOException {
        FileWriter writer = new FileWriter(new File(fname));
        for (Map.Entry<String, Integer> word : out.entrySet()) {
            if (word.getValue() == 1) {
                writer.write(word.getKey() + "\n");
            }
        }
        writer.close();
    }
    public static void main(final String[] args) throws IOException {
        Map<String, Integer> file1 = load("F:\\1.1_Java Advanced - may 2019\\L10 EXERCISE STREAMS, FILES AND DIRECTORIES\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Map<String, Integer> file2 = load("F:\\1.1_Java Advanced - may 2019\\L10 EXERCISE STREAMS, FILES AND DIRECTORIES\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");

        // below for loop will run just one time, so it is much faster
        for (Map.Entry<String, Integer> file1Word : file1.entrySet()) {
            if (file2.containsKey(file1Word.getKey())) {
                file1.put(file1Word.getKey(), 1);
                file2.put(file1Word.getKey(), 1);
            }
        }

        write(file1, "test1.txt");
        write(file2, "test2.txt");
    }
}

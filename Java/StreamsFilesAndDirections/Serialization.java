import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String userDir = System.getProperty("user.dir");
        String path = userDir + "/res/output.ivan";


        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Mimi", "Gosho");

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos =
                new ObjectOutputStream(fos);

        oos.writeObject(names);

        File file;
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois =
                new ObjectInputStream(fis);
        List<Integer> o = (List<Integer>) ois.readObject();
        System.out.println(o);
    }
    class A implements Serializable{

    }
}

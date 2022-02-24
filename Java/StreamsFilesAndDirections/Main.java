//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        String userDir = System.getProperty("user.dir");
//        //String path = userDir + "/res/input.txt";
//
//        try (FileInputStream fileStream = new FileInputStream(path)){
//            int oneByte = fileStream.read();
//            while (oneByte >= 0) {
//                System.out.print(oneByte);
//                oneByte = fileStream.read();
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}

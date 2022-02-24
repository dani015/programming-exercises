import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> asd = new LinkedHashMap<>();

        String line = " ";

        while(!line.equals("stop")){


            line = sc.nextLine();

            if(!line.equals("stop")){
                int quantity = Integer.parseInt(sc.nextLine());

                if(!asd.containsKey(line)){
                    asd.put(line, quantity);
                } else {
                    int value = asd.get(line);
                    asd.put(line, value += quantity);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : asd.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}

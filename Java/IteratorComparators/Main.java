import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());

        ListyIterator iterator = new ListyIterator(list);

        String line = scanner.nextLine();

        while (!line.equals("END")){
            String output = "";
            switch (line) {
                case "Move":
                    output = iterator.move() ? "true" : "false";
                    break;
                case "Print":
                    try {
                        output = iterator.print();
                    } catch (IllegalAccessException exception) {
                        output = exception.getMessage();
                    }
                    break;
                case "HasNext":
                    output = iterator.hasNext() ? "true" : "false";
                    break;
                case "PrintAll":
                    iterator.printAll();
                    break;
            }
            if(!output.equals("")) {

                System.out.println(output);
            }

             line = scanner.nextLine();

        }
    }

}

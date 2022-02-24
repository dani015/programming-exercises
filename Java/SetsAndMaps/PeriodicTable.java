import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<String> asd = new TreeSet<>();

        int count = Integer.parseInt(sc.nextLine());

        String[] line;

        while (count-- != 0){
            line = sc.nextLine().split("\\s+");

            asd.addAll(Arrays.asList(line));
        }

        System.out.println();

        asd.forEach(e -> System.out.print(e + " "));
    }
}

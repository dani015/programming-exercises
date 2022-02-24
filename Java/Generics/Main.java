import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Count<Double>> counts = new ArrayList<>();

        while (n-- > 0) {

            Double input = Double.parseDouble(reader.readLine());

            Count<Double> count = new Count<>(input);

            counts.add(count);

        }



        Count<Double> element = new Count<>(Double.parseDouble(reader.readLine()));

        int coount = countGreaterValue(counts, element);

       System.out.println(coount);
    }


    private static <T extends Comparable<T>> int countGreaterValue(List<Count<T>> counts,
                                                                   Count<T> element) {

        int n = 0;
        for (Count<T> count : counts){
            if(count.compareTo(element) > 0){
                n++;
            }
        }

        return n;


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        List<OpinionPoll> asd = new ArrayList<>();
        while (count-- > 0){
            String[] tokens = reader.readLine().split("\\s+");
            int age = Integer.parseInt(tokens[1]);

            if(age > 30) {
                String name = tokens[0];

                OpinionPoll opinionPoll = new OpinionPoll(name, age);
                asd.add(opinionPoll);
            }

        }


        asd.stream().sorted(Comparator.comparing(OpinionPoll::getName)).forEach(c -> System.out.println(c.oppInfo()));
    }
}

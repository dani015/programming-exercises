import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        Integer[] division = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Predicate<Integer> checkDiv = (i) -> {
            for (Integer a : division) {
                if(a == 0) continue;
                if(i % a != 0) return false;
            }
            return true;
        };

        for (Integer i : nums)
            if (checkDiv.test(i)) System.out.printf("%d ", i);
    }

    }


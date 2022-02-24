import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Character, Integer> asd = new TreeMap<>();

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if(!asd.containsKey(symbol)){
                asd.put(symbol, 1);
            } else {
                asd.put(symbol, asd.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : asd.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}

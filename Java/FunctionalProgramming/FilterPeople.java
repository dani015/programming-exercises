import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterPeople {

    public static void main(String[] args) {
        BiPredicate<Map.Entry<String, Integer>, Integer> youngerThan =
                (person, ageLimit) -> person.getValue() < ageLimit;

        BiPredicate<Map.Entry<String, Integer>, Integer> olderThan =
                (person, ageLimit) -> person.getValue() >= ageLimit;

        Consumer<Map.Entry<String, Integer>> printName = person ->
                System.out.println(person.getKey());

        Consumer<Map.Entry<String, Integer>> printAge = person ->
                System.out.println(person.getValue());

        Consumer<Map.Entry<String, Integer>> printNameAndAge = person ->
                System.out.printf("%s - %d%n", person.getKey(), person.getValue());

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        int peopleCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < peopleCount; i++) {
            String[] personData = scanner.nextLine().split(", ");

            people.put(personData[0], Integer.parseInt(personData[1]));
        }

        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        Consumer<Map.Entry<String, Integer>> print = printNameAndAge;

        if(printType.equals("age")) {
            print = printAge;
        } else if(printType.equals("name")) {
            print = printName;
        }

        BiPredicate<Map.Entry<String, Integer>, Integer> byAge = youngerThan;

        if(comparison.equals("older")){
            byAge = olderThan;
        }

        BiPredicate<Map.Entry<String, Integer>, Integer> finalByAge = byAge;

        people.entrySet().stream()
                .filter(person -> finalByAge.test(person, ageLimit))
                .forEach(print);
    }
}

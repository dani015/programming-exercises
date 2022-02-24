import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Person> people = new ArrayList<>();

        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");

            Person p = new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2]));

            people.add(p);
        }

        people.stream().sorted(Comparator.comparing(Person::getFirstName)
                .thenComparingInt(Person::getAge))

                .forEach(System.out::println);

    }
}

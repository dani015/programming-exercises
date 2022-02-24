package salaryIncrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Department department = new Department();

        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");
            try {


                Person p = new Person(tokens[0], tokens[1],
                        Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));

                department.addPerson(p);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        double bonus = Double.parseDouble(scanner.nextLine());

        List<Person> people = department.getPersonList();

        people.add(new Person("ABC", "ABC", 12, 500));

        for (Person person : department.getPersonList()) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}

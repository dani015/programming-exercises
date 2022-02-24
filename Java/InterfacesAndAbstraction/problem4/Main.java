package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> cNames = new ArrayList<>();
        List<String> rNames = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        while (n-- != 0){
            String[] p = scanner.nextLine().split("\\s+");

            if(p.length == 4){
                String name = p[0];
                int age = Integer.parseInt(p[1]);
                String id = p[2];
                String birthDate = p[3];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                cNames.add(name);
                citizens.add(citizen);

            } else if(p.length == 3){
                String name = p[0];
                int age = Integer.parseInt(p[1]);
                String group = p[2];

                Rebel rebel = new Rebel(name, age, group);
                rNames.add(name);
                rebels.add(rebel);
            }

        }

        String input = scanner.nextLine();
        int sum = 0;

        while (!input.equals("End")){


            for (Citizen c : citizens) {
                if (c.getName().equals(input)){
                    c.buyFood();
                    sum = sum + 10;
                }
            }

            for (Rebel r : rebels) {
                if(r.getName().equals(input)){
                    r.buyFood();
                    sum = sum + 5;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(sum);

    }


}

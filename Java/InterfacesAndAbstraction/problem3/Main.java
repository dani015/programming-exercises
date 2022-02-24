package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<String> birthDatesCitizen = new ArrayList<>();
        List<String> birthDatesPet = new ArrayList<>();
        List<String> yearsC = new ArrayList<>();
        List<String> yearsP = new ArrayList<>();

        String[] cDate = new String[2];
        String[] pDate = new String[2];

        while (true){
            if(input[0].equals("End")){
                break;
            }
            if(input[0].equals("Citizen")){
                String name = input[1];
                int age = Integer.parseInt(input[2]);
                String id = input[3];
                String birthDate = input[4];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                //System.out.println(citizen.toString());
                cDate = citizen.getBirthDate().split("/");
                birthDatesCitizen.add(birthDate);
                yearsC.add(cDate[2]);

            }
            if(input[0].equals("Robot")){
                String id = input[1];
                String model = input[2];

                Robot robot = new Robot(id, model);
                //System.out.println(robot.toString());

            }

            if(input[0].equals("Pet")){
                String name = input[1];
                String birthDate = input[2];

                Pet pet = new Pet(name, birthDate);
                //System.out.println(pet.toString());
                pDate = pet.getBirthDate().split("/");
                birthDatesPet.add(birthDate);
                yearsP.add(pDate[2]);
            }

            input = scanner.nextLine().split("\\s+");
        }

        int date = Integer.parseInt(scanner.nextLine());




                for (String str : birthDatesCitizen) {
                    String[] s = str.split("/");
                    String year = s[2];
                    if (date == Integer.parseInt(year)) {
                        System.out.println(str);
                    }
                }

        for (String str : birthDatesPet) {
            String[] s = str.split("/");
            String year = s[2];
            if (date == Integer.parseInt(year)) {
                System.out.println(str);
            }
        }
    }
}

package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kingName = scanner.nextLine();

        //String[] royalGuards = scanner.nextLine().split("\\s+");

        List<String> royalGuards = new ArrayList<>();
        royalGuards.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        ////String[] footmen = scanner.nextLine().split("\\s+");

        List<String> footmen = new ArrayList<>();
        footmen.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));

        RoyalGuard royalGuard = new RoyalGuard(royalGuards);

        Footman footman = new Footman(footmen);

        King king = new King(kingName);

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {
            String cmd = command[0];
            String name = command[1];

            if(cmd.equals("Attack")) {
                king.attacked();
                royalGuard.attacked();
                footman.attacked();
            }

            if(cmd.equals("Kill") && royalGuards.contains(name)) {
                royalGuard.killed(command[1]);
            } else if(cmd.equals("Kill") && footmen.contains(name)) {
                footman.killed(command[1]);
            }

            command = scanner.nextLine().split("\\s+");
        }


    }
}

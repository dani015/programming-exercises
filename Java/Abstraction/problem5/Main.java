package problem5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();


        Galaxy galaxy = new Galaxy(dimentions[0], dimentions[1]);

        StarCollector collector = new StarCollector(galaxy);

        String command = scanner.nextLine();

        long sum = 0;
        while (!command.equals("Let the Force be with you"))
        {
            int[] playerPosition = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] evilPosition = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            collector.destroyStars(evilPosition);

            sum += collector.sumOfStars(playerPosition);

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }
}

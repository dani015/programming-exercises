package rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleCoords = readIntArray(scanner);

        Point topLeft = new Point(rectangleCoords[0], rectangleCoords[1]);
        Point bottomRight = new Point(rectangleCoords[2], rectangleCoords[3]);
        Rectangle rect = new Rectangle(topLeft, bottomRight);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            int[] pointCoords = readIntArray(scanner);

            Point current = new Point(pointCoords[0], pointCoords[1]);

            System.out.println(rect.contains(current));
        }
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
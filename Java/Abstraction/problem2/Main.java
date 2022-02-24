package problem2;

import problem1.Suits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("Card Ranks")) {
            System.out.println("Card Ranks:");
            for (Ranks card : Ranks.values()) {
                System.out.println("Ordinal value: " + card.getValue() + "; Name value: " + card);

            }
        }
    }
}

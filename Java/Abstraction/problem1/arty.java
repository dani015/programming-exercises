package problem1;

import java.util.Scanner;

public class arty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int i = 0;

        if(input.equalsIgnoreCase("Card Suits")){
            System.out.println("Card Suits:");
            for (Suits card : Suits.values()){
                System.out.println("Ordinal value: " + i + "; Name value: " + card);
                i++;
            }
        }
    }
}

package problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");

        PrimitiveCalculator pc = new PrimitiveCalculator();

        while (!nums[0].equals("End")) {
            char numCheck = nums[0].charAt(0);

            if(nums[0].equals("mode")) {
                char operator = nums[1].charAt(0);
                pc.changeStrategy(operator);
            }

            if(Character.isDigit(numCheck) || numCheck == '-') {
                int num1 = Integer.parseInt(nums[0]);
                int num2 = Integer.parseInt(nums[1]);

                pc.performCalculation(num1, num2);
            }

            nums = scanner.nextLine().split("\\s+");
        }

    }
}
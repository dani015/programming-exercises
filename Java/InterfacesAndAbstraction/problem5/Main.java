package problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        List<String> urls = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        Smartphone smartphone = new Smartphone(numbers, urls);


        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());



//        List<String> urls = Arrays.asList(scanner.nextLine().split("\\s+").clone());



    }
}

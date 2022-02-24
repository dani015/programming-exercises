package classbox;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());

        double width = Double.parseDouble(scanner.nextLine());

        double height = Double.parseDouble(scanner.nextLine());

        if(length <= 0 && width <= 0 && height <= 0){
            System.out.println("Length cannot be zero or negative.");
            System.out.println("Width cannot be zero or negative.");
            System.out.println("Heigth cannot be zero or negative.");
            return;
        }

        if(length <= 0 && width <= 0){
            System.out.println("Length cannot be zero or negative.");
            System.out.println("Width cannot be zero or negative.");
            return;
        }

        if(length <= 0 && height <= 0){
            System.out.println("Length cannot be zero or negative.");
            System.out.println("Height cannot be zero or negative.");
            return;
        }

        if(width <= 0 && height <= 0){
            System.out.println("Width cannot be zero or negative.");
            System.out.println("Height cannot be zero or negative.");
            return;
        }

        if(length <= 0){
            System.out.println("Length cannot be zero or negative.");
            return;
        }
        if(width <= 0){
            System.out.println("Width cannot be zero or negative.");
            return;
        }
        if(height <= 0){
            System.out.println("Height cannot be zero or negative.");
            return;
        }


        Box box = new Box(length, width, height);



        System.out.println("Surface Area - " +
                String.format("%.2f", box.calculateSurfaceArea()));
        System.out.println("Lateral Surface Area - " +
                String.format("%.2f", box.calculateLateralSurfaceArea()));
        System.out.println("Volume - " +
                String.format("%.2f", box.calculateVolume()));

    }
}

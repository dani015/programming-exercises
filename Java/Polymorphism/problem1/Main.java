package problem1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String type = carInfo[0];
        double fuel = Double.parseDouble(carInfo[1]);
        double fuelPerKM = Double.parseDouble(carInfo[2]);
        int tankCapacity = Integer.parseInt(carInfo[3]);

        Car car = new Car(fuel, fuelPerKM);

        String[] truckInfo = scanner.nextLine().split("\\s+");
        String typeT = truckInfo[0];
        double fuelT = Double.parseDouble(truckInfo[1]);
        double fuelPerKMT = Double.parseDouble(truckInfo[2]);
        int tankCapacityT = Integer.parseInt(carInfo[3]);


        Truck truck = new Truck(fuelT, fuelPerKMT);

        String[] busInfo = scanner.nextLine().split("\\s+");
        String typeB = busInfo[0];
        double fuelB = Double.parseDouble(busInfo[1]);
        double fuelPerKMB = Double.parseDouble(busInfo[2]);
        int tankCapacityB = Integer.parseInt(busInfo[3]);

        Bus bus = new Bus(fuelB, fuelPerKMB);

        //....................................................

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String[] command = scanner.nextLine().split("\\s+");
            String whatToDo = command[0];
            String typec = command[1];
            double driveOrFuel = Double.parseDouble(command[2]);

            if(driveOrFuel <= 0){
                System.out.println("Fuel must be a positive number");
                continue;
            }

            if(whatToDo.equals("Drive")){
                if(typec.equals("Car")){
                    System.out.println(car.drive(driveOrFuel));
                } else if(typec.equals("Truck")){
                    System.out.println(truck.drive(driveOrFuel));
                } else if(typec.equals("Bus")){
                    System.out.println(bus.drive(driveOrFuel));
                }
            }

            if(whatToDo.equals("Refuel")){
                if(typec.equals("Car")){
                    car.refuel(driveOrFuel, tankCapacity);
                } else if(typec.equals("Truck")){
                    truck.refuel(driveOrFuel, tankCapacityT);
                } else if(typec.equals("Bus")){
                    bus.refuel(driveOrFuel, tankCapacityB);
                }
            }

            if(whatToDo.equals("DriveEmpty")){
                System.out.println(bus.driveEmpty(driveOrFuel));
            }

        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.printf("Car: %.2f", car.getFuelQuantity());
        System.out.println();
        System.out.printf("Truck: %.2f", truck.getFuelQuantity());
        System.out.println();
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());


    }
}

package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Food> foods = new ArrayList<>();

        while (true){

            String input = scanner.nextLine();
            if(input.equals("End")){
                break;
            }
            String[] tokens = input.split("\\s+");

            Animal animal = null;
            if(tokens[0].equals("Cat")){
                animal = new Cat(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                        tokens[3], tokens[4]);
            } else if(tokens[0].equals("Tiger")){
                animal = new Tiger(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                        tokens[3]);
            }else if(tokens[0].equals("Mouse")){
                animal = new Mouse(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                        tokens[3]);
            } else {
                animal = new Zebra(tokens[1], tokens[0], Double.parseDouble(tokens[2]),
                        tokens[3]);
            }

            input = scanner.nextLine();

            tokens = input.split("\\s+");

            Food food = null;

            if(tokens[0].equals("Vegetable")){
                food = new Vegetable(Integer.parseInt(tokens[1]));
            }else{
                food = new Meat(Integer.parseInt(tokens[1]));
            }

            animals.add(animal);
            foods.add(food);

        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).makeSound());
            try {
                animals.get(i).eat(foods.get(i));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

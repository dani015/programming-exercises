package dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.bark());

        Cat cat = new Cat();
        System.out.println(cat.eat());
        System.out.println(cat.meow());
    }
}
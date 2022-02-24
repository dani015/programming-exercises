package p03_IteratorTest;

import javax.naming.OperationNotSupportedException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        Scanner scanner = new Scanner(System.in);

        String create = scanner.nextLine();





        String names = create.substring(create.indexOf("Create") + 7);

       // System.out.println(names);

        String[] name = names.split("\\s+");

        if(names.length() == 0) {
            System.out.println("Invalid Operation!");
            return;
        }

        //System.out.println(names.length());

        ListIterator iterator = new ListIterator(name);





        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("END")) {
            if(command.equalsIgnoreCase("Print")) {
                System.out.println(iterator.print());
            } else if(command.equalsIgnoreCase("HasNext")) {
                System.out.println(iterator.hasNext());
            } else if(command.equalsIgnoreCase("Move")) {
                System.out.println(iterator.move());
            }


            command = scanner.nextLine();
        }


    }
}

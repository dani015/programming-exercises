package problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dispatcher dispatcher = new Dispatcher();
        Handler handler = new Handler();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            NameChange nc = new NameChange(command);
            handler.handleChangedName(new Event(command));
            dispatcher.setName(command);
            dispatcher.fireNameChangeEvent();
            command = scanner.nextLine();
        }
    }
}

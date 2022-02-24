package Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] student1 = scanner.nextLine().split("\\s+");
        String studentFirstName = student1[0];
        String studentLastName = student1[1];
        String facultyNumber = student1[2];

        String[] worker1 = scanner.nextLine().split("\\s+");
        String workerFirstName = worker1[0];
        String workerLastName = worker1[1];
        double weekSalary = Double.parseDouble(worker1[2]);
        double hoursPerDay = Double.parseDouble(worker1[3]);


        try {
            Student student = new Student(studentFirstName, studentLastName, facultyNumber);
            Worker worker = new Worker(workerFirstName, workerLastName, weekSalary, hoursPerDay);

            System.out.println(student.toString());
            System.out.println(worker.toString());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

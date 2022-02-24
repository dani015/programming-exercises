import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        HashMap<String, Department> departments = new HashMap<>();
        while (count-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String department = tokens[3];

            Person per = new Person(tokens[0], Double.parseDouble(tokens[1]), tokens[2]);

            if(tokens.length == 5){
                if (Character.isDigit(tokens[4].charAt(0))) {
                    per.setAge(Integer.parseInt(tokens[4]));
                } else {
                    per.setEmail(tokens[4]);
                }
            } else if(tokens.length == 6){
                per.setEmail(tokens[4]);
                per.setAge(Integer.parseInt(tokens[5]));
            }

            if(!departments.containsKey(department)){
                departments.put(department, new Department());
            }
            departments.get(department).addPerson(per);
        }

        Map.Entry<String, Department> highestAverageSalary = departments.entrySet().stream()
                .sorted((f, s) -> {
                 int result = 0;
                 if(s.getValue().getAverageSalary() > f.getValue().getAverageSalary()){
                        result = -1;
                 } else if(s.getValue().getAverageSalary() < f.getValue().getAverageSalary()){
                        result = 1;
                 }
                    return result;
                }).findFirst()
                .get();


        System.out.println(String.format("Highest Average Salary: %s", highestAverageSalary));
        highestAverageSalary.getValue().getPersons()
                .stream()
                .sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(p -> {
                    System.out.println(String.format("%s %.2f %s %d", p.getName(), p.getSalary(), p.getEmail(), p.getAge()));
                });



        }
    }


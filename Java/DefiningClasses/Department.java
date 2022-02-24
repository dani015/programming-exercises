import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Person> persons;

    public Department(){
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.persons.add(person);
    }

    public double getAverageSalary(){
        return this.persons
                .stream()
                .mapToDouble(Person::getSalary)
                .average()
                .getAsDouble();
    }

    public List<Person> getPersons(){
        return this.persons;
    }
}

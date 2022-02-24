package salaryIncrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private List<Person> personList;

    public Department(){
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList(){
         return this.personList;
    }

    public void addPerson(Person p){
        this.personList.add(p);
    }
}

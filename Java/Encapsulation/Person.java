public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String secondName, Integer age){
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }


    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.",
                this.getFirstName(), this.getLastName(),
                this.getAge());
    }
}
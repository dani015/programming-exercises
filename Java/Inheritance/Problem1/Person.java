package Problem1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    protected void setName(String name) {
        if(name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        } else {
            this.name = name;
        }

    }

    protected void setAge(int age) throws IllegalArgumentException{
        if(age < 1){
            throw new IllegalArgumentException("Age must be positive!");
        }else {
            this.age = age;
        }

    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge());
    }
}

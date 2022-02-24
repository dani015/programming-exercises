package AnimalFarm;

public class Chicken {
    private String name;
    private int age;
    private double eggs;


    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if(name.equals("") || name.equals(" ") || name.equals(null)){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age > 15 || age < 0){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay(){
        if(this.age <= 5){
            this.eggs = 2;
            return this.eggs;
        } else if(this.age <= 11){
            this.eggs = 1;
            return this.eggs;
        }else {
            this.eggs = 0.75;
            return this.eggs;
        }
    }


    public String productPerDay(){
        if(calculateProductPerDay() >= 1) {
            return String.format("Chicken %s (age %d) can produce %.0f eggs per day.",
                    this.name, this.age, calculateProductPerDay());
        } else {
            return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                    this.name, this.age, calculateProductPerDay());
        }
    }

}

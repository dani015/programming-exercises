package problem2;

public abstract class Animal implements Feedable, Soundable{
    private String name;
    private String type;
    private double weight;
    private int foodEaten;

    public Animal(String name, String type, double weight){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = 0;
    }

    protected void setFoodEaten(int quantity){
        this.foodEaten = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }
}

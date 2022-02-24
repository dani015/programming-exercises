package problem2;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String name, String type, double weight, String livingRegion) {
        super(name, type, weight);
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food){
        if(food.getClass().getSimpleName().equals("Vegetable")){
            super.setFoodEaten(food.getQuantity());
            return;
        }

        String animalType = this.getClass().getSimpleName().equals("Mouse") ?
                "Mice" : "Zebras";

        throw new IllegalArgumentException(animalType
                + "are not eating this type of food!");
    }

    @Override
    public String toString() {

        DecimalFormat format = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]", this.getClass().getSimpleName(),
                this.getName(), format.format(this.getWeight()),
                this.livingRegion, this.getFoodEaten());

    }
}

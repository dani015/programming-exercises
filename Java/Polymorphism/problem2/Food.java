package problem2;

public abstract class Food {
    Integer quantity;


    public Food(Integer quantity) {
        this.quantity = quantity;

    }

    public int getQuantity(){
        return this.quantity;
    }
}

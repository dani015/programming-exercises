import java.util.ArrayList;
import java.util.List;

public class Car {
    public static String type;
    private String make;
    private String model;
    private int horsePower;


    public Car(String make) {
        this(make, "", -1);
    }
    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;

    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) { this.make = make; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void increaseHP(int value) {
        this.horsePower += value;
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.",
                this.getMake(),
                this.getModel(),
                this.getHorsePower());
    }
}

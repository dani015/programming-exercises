package problem1;

import java.text.DecimalFormat;

public class Car implements Refualable{
    private double fuelQuantity; //how much fuel (ex. 15)
    private double literPerKm;  //liters per km (ex. 0.3, 2)
    //private int drivenLiters; //kilometers driven

    public Car(double fuelQuantity, double literPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.literPerKm = literPerKm;

    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLiterPerKm() {
        return literPerKm;
    }

    public void setLiterPerKm(double literPerKm) {
        this.literPerKm = literPerKm;
    }

//    public int getDrivenLiters() {
//        return drivenLiters;
//    }



    @Override
    public String drive(double drivenKM) {
        DecimalFormat df = new DecimalFormat("#.##");

        if(this.fuelQuantity - (this.literPerKm * drivenKM) - (0.9 * drivenKM) >= 0) {
            this.fuelQuantity = this.fuelQuantity - (this.literPerKm * drivenKM) - (0.9 * drivenKM);
            return "Car travelled "+ df.format(drivenKM) + " km";
        }
        return "Car needs refueling";
    }

    @Override
    public void refuel(double refuelQuantity, int tankCapacity) {
        if(fuelQuantity + refuelQuantity < tankCapacity) {
             fuelQuantity += refuelQuantity;
        } else {
            System.out.println("Cannot fit fuel in tank");
        }

    }
}

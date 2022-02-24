package problem1;

import java.text.DecimalFormat;

public class Bus implements Refualable{
    private double fuelQuantity;
    private double literPerKm;
   //private int drivenLiters;


    public Bus(double fuelQuantity, double literPerKm) {
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




    public String driveEmpty(double drivenKM){
        DecimalFormat df = new DecimalFormat("#.##");

        if(this.fuelQuantity - (this.literPerKm * drivenKM) >= 0) {
            this.fuelQuantity = this.fuelQuantity - (this.literPerKm * drivenKM);
            return "Bus travelled "+ df.format(drivenKM) + " km";
        }
        return "Bus needs refueling";

    }

    @Override
    public String drive(double drivenKM) {
        DecimalFormat df = new DecimalFormat("#.##");

        if(this.fuelQuantity - (this.literPerKm * drivenKM) - (1.4 * drivenKM) >= 0) {
            this.fuelQuantity = this.fuelQuantity - (this.literPerKm * drivenKM) - (1.4 * drivenKM);
            return "Bus travelled "+ df.format(drivenKM) + " km";
        }
        return "Bus needs refueling";
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

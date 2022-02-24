package problem1;

import java.text.DecimalFormat;

public class Truck implements Refualable{
    private double fuelQuantity;
    private double literPerKm;
    //private int drivenLiters;


    public Truck(double fuelQuantity, double literPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.literPerKm = literPerKm;

    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLiterPerKm() {
        return literPerKm;
    }

    public void setLiterPerKm(int literPerKm) {
        this.literPerKm = literPerKm;
    }

//    public int getDrivenLiters() {
//        return drivenLiters;
//    }
//
//    public void setDrivenLiters(int drivenLiters) {
//        this.drivenLiters = drivenLiters;
//    }



    @Override
    public String drive(double drivenKM) {
        DecimalFormat df = new DecimalFormat("#.##");

        if(fuelQuantity - (literPerKm * drivenKM + drivenKM * 1.6) >= 0){
            fuelQuantity = fuelQuantity - (literPerKm * drivenKM + drivenKM * 1.6);
            return "Truck travelled "+ df.format(drivenKM) + " km";
        }
        return "Truck needs refueling";
    }

    @Override
    public void refuel(double refuelQuantity, int tankCapacity) {
        if(fuelQuantity + (refuelQuantity * 0.95) < tankCapacity) {
            fuelQuantity += (refuelQuantity * 0.95);
        } else {
            System.out.println("Cannot fit fuel in tank");
        }

    }
}

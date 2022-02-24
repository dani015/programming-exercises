package carshop;

public interface Rentable extends Car{
    Integer getMinRentDay();
    Double getPricePerDay();

    static double priceForDays(int days){
        return days;
    }
}

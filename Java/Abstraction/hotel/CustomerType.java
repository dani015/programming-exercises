package hotel;

public enum CustomerType {
    Regular(0),
    SecondClass(10),
    VIP(20);

    int discount;

    CustomerType(int discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount / 100.0;
    }
}

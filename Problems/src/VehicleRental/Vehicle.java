package VehicleRental;

public class Vehicle {
    private String brand;
    private double basePrice;
    private boolean isRented;

    public String getBrand() {
        return brand;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public double CalculatePrice(int days){
        return basePrice * days;
    }

    public Vehicle(String brand, double basePrice, boolean isRented){
        this.brand = brand;
        this.basePrice = basePrice;
        this.isRented = isRented;
    }

    public Vehicle(){}
}

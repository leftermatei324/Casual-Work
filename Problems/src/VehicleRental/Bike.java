package VehicleRental;

public class Bike extends Vehicle implements Rentable{
    public Bike(String brand, double basePrice, boolean isRented){
        super(brand, basePrice, isRented);
    }

    @Override
    public void rent(int days) {
        if(!isRented()){
            setRented(true);
            System.out.println("Bike rented for " + days + " days and the Price is " + CalculatePrice(days));
        }else {
            System.out.println("Bike is already rented");
        }
    }

    @Override
    public double CalculatePrice(int days) {
        return super.CalculatePrice(days);
    }
}

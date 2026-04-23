package VehicleRental;

public class Car extends Vehicle implements Rentable{
    public Car(String brand, double basePrice, boolean isRented){
        super(brand, basePrice, isRented);
    }

    @Override
    public void rent(int days) {
        if(!isRented()){
            setRented(true);
            System.out.println("Car rented for " + days + " days and the Price is " + CalculatePrice(days));
        }else {
            System.out.println("Car is already rented");
        }
    }

    @Override
    public double CalculatePrice(int days) {
        return super.CalculatePrice(days) + 100;
    }
}

package VehicleRental;

public class Customer {
    private String name;
    private Vehicle rentedVehicle;

    public Customer(String name){
        this.name = name;
    }

    public void rentVehicle(Rentable vehicle, int days){
        vehicle.rent(days);
        rentedVehicle = (Vehicle) vehicle; //casting
    }

}

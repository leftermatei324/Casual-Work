package VehicleRental;

public class VehicleRentalMain {
    public static void main(String[] args) {
        Vehicle car = new Car("Dacia", 80, false);
        Vehicle bike = new Bike("WTP", 50, false);

        Customer customer1 = new Customer("Matei");
        Customer customer2 = new Customer("Andrei");

        customer1.rentVehicle((Rentable) bike, 100);
        customer2.rentVehicle((Rentable) car, 7);

    }
}

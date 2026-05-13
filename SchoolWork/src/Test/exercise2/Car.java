package Test.exercise2;

public class Car extends Vehicle{
    private String brand;
    private Engine engine;

    public Car(String brand, double speed, int weight, Engine engine){
        super(speed, weight);
        this.brand  =brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Weight: " + getWeight());
        engine.printInfo();
    }
}

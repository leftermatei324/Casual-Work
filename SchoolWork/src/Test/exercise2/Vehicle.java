package Test.exercise2;

public class Vehicle {
    private double speed;
    private int weight;

    public Vehicle(double speed, int weight){
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}

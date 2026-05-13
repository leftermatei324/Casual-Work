package Test.exercise2;

public class EX2Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(200, "V8");
        Engine e2 = new Engine(150, "V6");

        Car c1 = new Car("BMW", 200, 1500, e1);
        Car c2 = new Car("Audi", 180, 1400, e2);

        c1.showCarInfo();
        c2.showCarInfo();



        /*
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle(100, 500);
        vehicles[1] = new Car("BMW", 85, 700);
        vehicles[2] = new Car("Audi", 190, 100);

        for (Vehicle x : vehicles){
            System.out.println(x);
        }

         */

    }
}

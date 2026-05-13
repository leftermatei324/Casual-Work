package Test;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Audi", 15000));
        cars.add(new Car(2, "Mercedes", 450000));
        cars.add(new Car(3, "BMW", 21000));
        cars.add(new Car(2, "Toyota", 5000));

        System.out.println(cars);

        for (int i = 0; i < cars.size() ; i++){
            for (int j = i + 1; j < cars.size(); j++){
                if (cars.get(i).equals(cars.get(j)) ){
                    cars.remove(j);
                    j--;
                }
            }
        }

        System.out.println(cars);

        try {
            Car original = cars.get(0);

            Car copy = (Car) original.clone();

            original.setBrand("Changed Brand");

            System.out.println(original);
            System.out.println(copy);
        }catch (CloneNotSupportedException e ){
            e.printStackTrace();
        }
    }
}

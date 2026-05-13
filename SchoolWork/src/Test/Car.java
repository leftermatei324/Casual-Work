package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car implements Cloneable{
    private int id;
    private String brand;
    private double price;

    public Car(){}

    public Car(int id, String brand, double price){
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }
        if (!(o instanceof Car)){
            return false;
        }
        Car c = (Car) o;
        return this.id == c.id;

        /*
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand);

         */
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}



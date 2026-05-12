package Test;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Cloneable, Comparable<Product>, Serializable {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id= id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return this.id == p.id &&
                this.price == p.price &&
                this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return (int)(id + price + name.length());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

package Important;

import java.util.Objects;

class Product{
    private String name;
    private int price;
    private int valability;

    public Product(String name, int price, int valability){
        this.name = name;
        this.price = price;
        this.valability = valability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValability() {
        return valability;
    }

    public void setValability(int valability) {
        this.valability = valability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", valability=" + valability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && valability == product.valability && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, valability);
    }
}

public class EqualsHashCode {
    public static void main(String[] args) {
        Product p1= new Product("Laptop", 100, 10);
        System.out.println(p1);

        Product p2 = new Product("Laptop", 100, 10);
        System.out.println(p2);

        System.out.println("Obiectele verificate sunt egale " + p1.equals(p2));

        System.out.println(p1.hashCode());

    }
}

package Test.exercise4;

import java.util.Objects;

public class Item implements Comparable<Item>{
    private int id;
    private String title;
    private double price;

    public Item(){}
    public Item(int id, String title, double price){
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o)return true;
        if (!(o instanceof Item))return false;
        Item t = (Item) o;
        return Integer.compare(this.id, t.id) == 0;
        /*if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Double.compare(price, item.price) == 0 && Objects.equals(title, item.title);

         */
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Item o) {
        return Double.compare(this.price,o.price);
    }
}

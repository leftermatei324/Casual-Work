package Test.exercise4;

import java.io.Serializable;
import java.util.List;

public class Order implements Comparable<Order>, Serializable {
    private int orderId;
    private String customerName;
    private List<Item> items;

    public Order(int orderId, String customerName, List<Item> items){
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                '}';
    }

    public void addItem(Item item){
        items.add(item);
    }

    @Override
    public int compareTo(Order o) {
        return Integer.compare(this.orderId, o.orderId);
    }

    public double getTotal() {
        double sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }
}

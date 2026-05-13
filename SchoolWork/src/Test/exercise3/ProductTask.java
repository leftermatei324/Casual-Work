package Test.exercise3;

import java.util.List;

public class ProductTask implements Runnable{
    private List<Product> products;
    private boolean highPrice;

    public ProductTask(List<Product> products, boolean highPrice){
        this.products = products;
        this.highPrice = highPrice;
    }

    @Override
    public void run() {
        for (Product p : products){
            if (highPrice && p.getPrice() > 30){
                System.out.println("High: " + p);
            } else if (!highPrice && p.getPrice() <= 30) {
                System.out.println("Low: " + p);
            }
        }
    }
}

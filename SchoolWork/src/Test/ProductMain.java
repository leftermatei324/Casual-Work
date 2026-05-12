package Test;

import java.util.*;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // 1) Add products (with duplicates)
        products.add(new Product(1,"A",50));
        products.add(new Product(2,"B",30));
        products.add(new Product(1,"C",50)); // duplicate id
        products.add(new Product(3,"D",70));
        products.add(new Product(2,"E",30)); // duplicate id

        // 2) Sort by id (Comparable)
        Collections.sort(products);
        System.out.println("Sorted by id:");
        System.out.println(products);

        // 3) Sort by name (Comparator)
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return a.getName().compareTo(b.getName());
            }
        });
        System.out.println("Sorted by name:");
        System.out.println(products);

        // 4) Find most expensive product
        Product max = products.get(0);
        for (Product p : products) {
            if (p.getPrice() > max.getPrice()) {
                max = p;
            }
        }
        System.out.println("Most expensive: " + max);

        // 5) Remove duplicates manually (by equals -> id)
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).equals(products.get(j))) {
                    products.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After removing duplicates:");
        System.out.println(products);

        // 6) Group by price
        Map<Double, List<Product>> map = new HashMap<>();

        for (Product p : products) {
            double price = p.getPrice();

            if (!map.containsKey(price)) {
                map.put(price, new ArrayList<>());
            }

            map.get(price).add(p);
        }

        // 7) Print map
        System.out.println("Grouped by price:");
        System.out.println(map);

        // 8) Final list
        System.out.println("Final list:");
        System.out.println(products);

    }
}

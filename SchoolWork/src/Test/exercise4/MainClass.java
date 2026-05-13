package Test.exercise4;

import java.io.*;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        // ---------------- ORDERS ----------------
        Order o1 = new Order(101, "Matei", new ArrayList<>());
        o1.addItem(new Item(1, "Faina", 3));
        o1.addItem(new Item(2, "Malai", 1));

        Order o2 = new Order(102, "Ana", new ArrayList<>());
        o2.addItem(new Item(3, "Suc", 5));
        o2.addItem(new Item(4, "Carne", 25));

        Order o3 = new Order(103, "Paul", new ArrayList<>());
        o3.addItem(new Item(5, "Paine", 2));
        o3.addItem(new Item(6, "Lapte", 4));

        Order o4 = new Order(104, "Ioana", new ArrayList<>());
        o4.addItem(new Item(7, "Oua", 10));
        o4.addItem(new Item(8, "Zahar", 3));

        List<Order> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);

        System.out.println("Original:");
        System.out.println(orders);

        // ---------------- SORT ORDERS ----------------
        Collections.sort(orders);
        System.out.println("\nSorted by orderId:");
        System.out.println(orders);

        // ---------------- MAX ORDER BY TOTAL ----------------
        Order maxOrder = Collections.max(orders, Comparator.comparing(Order::getTotal));
        System.out.println("\nMax order by total:");
        System.out.println(maxOrder);

        // ---------------- REMOVE DUPLICATE ORDERS ----------------
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(i).equals(orders.get(j))) {
                    orders.remove(j);
                    j--;
                }
            }
        }

        System.out.println("\nAfter duplicates removal:");
        System.out.println(orders);

        // ---------------- MAP GROUPING ----------------
        Map<Double, List<Item>> map = new HashMap<>();

        for (Order o : orders) {
            for (Item i : o.getItems()) {
                map.computeIfAbsent(i.getPrice(), k -> new ArrayList<>()).add(i);
            }
        }

        System.out.println("\nGrouped by price:");
        System.out.println(map);

        // ---------------- WRITE FILE ----------------
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt"))) {

            for (Order o : orders) {
                for (Item i : o.getItems()) {
                    bw.write(o.getOrderId() + "," +
                            o.getCustomerName() + "," +
                            i.getId() + "," +
                            i.getTitle() + "," +
                            i.getPrice());
                    bw.newLine();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------------- READ FILE ----------------
        Map<Integer, Order> temp = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("orders.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                int orderId = Integer.parseInt(parts[0]);
                String name = parts[1];

                int itemId = Integer.parseInt(parts[2]);
                String title = parts[3];
                double price = Double.parseDouble(parts[4]);

                temp.putIfAbsent(orderId, new Order(orderId, name, new ArrayList<>()));

                temp.get(orderId).addItem(new Item(itemId, title, price));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Order> loadedOrders = new ArrayList<>(temp.values());

        System.out.println("\nLoaded from file:");
        System.out.println(loadedOrders);

        // ---------------- SERIALIZATION ----------------
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("orders.ser"))) {

            oos.writeObject(loadedOrders);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------------- DESERIALIZATION ----------------
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("orders.ser"))) {

            List<Order> finalData = (List<Order>) ois.readObject();

            System.out.println("\nDeserialized:");
            System.out.println(finalData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
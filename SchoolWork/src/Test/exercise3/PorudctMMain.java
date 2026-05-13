package Test.exercise3;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class PorudctMMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "A", 50));
        products.add(new Product(2, "B", 20));
        products.add(new Product(3, "C", 80));
        products.add(new Product(4, "D", 10));
        products.add(new Product(5, "E", 60));
        products.add(new Product(6, "F", 20));
        System.out.println(products);
        System.out.println();

        Runnable r1 = new ProductTask(products, true);
        Runnable r2 = new ProductTask(products, false);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();


        Map<Double, List<Product>> map = new HashMap<>();

        for (Product p : products){
            double price = p.getPrice();

            map.computeIfAbsent(price, k -> new ArrayList<>()).add(p);
        }
        System.out.println(map);



        Iterator<Product> it = products.iterator();

        while (it.hasNext()){
            Product p = it.next();

            if (p.getPrice() < 30){
                it.remove();
            }
        }
        System.out.println(products);


        products.forEach(p -> System.out.println(p));

        products.sort((a,b ) -> Double.compare(a.getPrice(), b.getPrice()));
        System.out.println(products);



        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.ser"))){
            oos.writeObject(products);
            System.out.println("Objects saved!");

        }catch (Exception e){
            e.printStackTrace();
        }

        List<Product> loadedProducts = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.ser"))){
            loadedProducts = (List<Product>) ois.readObject();
            System.out.println("Object loaded");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(loadedProducts);



        try (BufferedWriter bw = new BufferedWriter(new FileWriter("products.txt"));){

            for (Product p : products){
                bw.write(p.getId() + "," + p.getName() + "," + p.getPrice());
                bw.newLine();
            }

            bw.close();

            System.out.println("File written successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Product> readProduct = new ArrayList<>();

        try (BufferedReader br  = new BufferedReader(new FileReader("products.txt"))){
            String line;

            while ((line = br.readLine()) != null){
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);

                readProduct.add(new Product(id, name,price));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(readProduct);


        Collections.sort(products);
        System.out.println(products);

        Product max = products.get(0);
        for (Product p :  products){
            if (p.getPrice() > max.getPrice()){
                max = p;
            }
        }

        System.out.println(max);

        for (int i = 0; i < products.size(); i++){
            for (int j = i+1; j < products.size(); j++){
                if (products.get(i).equals(products.get(j))){
                    products.remove(j);
                    j--;
                }
            }
        }
        System.out.println(products);






    }


}

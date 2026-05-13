package Test.exercise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ex6Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("book.txt"))){
            String lines;
            while ((lines = br.readLine())!= null){
                String[] parts = lines.split(",");

                String title = parts[0];
                String author = parts[1];
                int pages = Integer.parseInt(parts[2]);
                int year = Integer.parseInt(parts[3]);
                double rating = Double.parseDouble(parts[4]);

                books.add(new Book(title,author,pages,year,rating));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(books);

        Collections.sort(books);

        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getRating() < 4.6){
                books.remove(i);
                i--;
            }
        }

        Map<String, List<Book>> map = new HashMap<>();

        for (Book b: books){
            String author = b.getAuthor();
            if (!(map.containsKey(author))){
                map.put(author, new ArrayList<>());
            }
            map.get(author).add(b);
        }

        int sum = 0;
        double sum1 = 0;
        for (Book b:  books){
            sum = sum + b.getPages();
            sum1 = sum1 + b.getRating();
        }

        double avg = (double) sum1 / books.size();
        System.out.println(avg);

        Book max = books.get(0);
        for (Book b : books){
            if (b.getPages() > max.getPages()){
                max = b;
            }
        }
        System.out.println(max);

        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getYear() > 2000){
                books.remove(i);
            }
        }

        Thread t1 = new Thread(new BookTask(books, 1));
        Thread t2 = new Thread(new BookTask(books, 2));
        Thread t3 = new Thread(new BookTask(books, 3));

       t1.start();
       t2.start();
       t3.start();


    }
}

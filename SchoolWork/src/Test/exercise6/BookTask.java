package Test.exercise6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class BookTask implements Runnable{
    private List<Book> books;
    private int type;

    public BookTask(List<Book> books, int type){
        this.books = books;
        this.type = type;
    }


    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))){
            for (Book b :books ){
                if (type == 1 && b.getPages() > 350){
                    bw.write(">350pages" + b);
                    bw.newLine();
                }
                if (type == 2 && b.getRating() > 4.7){
                    bw.write(">4.7 rating" + b);
                    bw.newLine();
                }
                if (type == 3 && b.getYear() <  2000){
                    bw.write("<2000" + b);
                    bw.newLine();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

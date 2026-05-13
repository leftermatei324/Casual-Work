package Test.exercise6;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pages;
    private int year;
    private double rating;

    public Book(String title, String author, int pages, int year, double rating){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return rating == book.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rating);
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(this.rating, o.rating);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}

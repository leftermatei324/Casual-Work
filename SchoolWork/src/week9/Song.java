package week9;

import java.util.ArrayList;
import java.util.List;

public class Song extends ArrayList {
    private String title;
    private String artist;
    private Genre genre;
    private int year;
    private int durationInSeconds;
    private double rating;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Song(String title, String artist, Genre genre, int year, int duration, double rating) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.durationInSeconds = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "week9.Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                ", durationInSeconds=" + durationInSeconds +
                ", rating=" + rating +
                '}';
    }

    @Override
    public List reversed() {
        return super.reversed();
    }
}

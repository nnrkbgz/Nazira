public class Artwork {
    private String title;
    private int yearCreated;
    private double price;
    private Artist artist;

    public Artwork(String title, int yearCreated, double price, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.price = price;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public double getPrice() {
        return price;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void showInfo() {
        System.out.println("Artwork: " + title);
        System.out.println("Year: " + yearCreated);
        System.out.println("Price: $" + price);
        System.out.println("Artist: " + artist.getName());
    }
}

import java.util.Objects;

public class Artwork implements Comparable<Artwork> {

    private String title;
    private int year;
    private double price;
    private Artist artist;

    public Artwork(String title, int year, double price, Artist artist) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " (" + year + "), $" + price + ", Artist: " + artist.getInfo();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artwork)) return false;
        Artwork artwork = (Artwork) o;
        return Objects.equals(title, artwork.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public int compareTo(Artwork other) {
        return Double.compare(this.price, other.price);
    }
}

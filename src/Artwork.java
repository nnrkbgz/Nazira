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

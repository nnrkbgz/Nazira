public class ArtGallery {
    private String name;
    private String location;
    private Artwork[] artworks;

    public ArtGallery(String name, String location, Artwork[] artworks) {
        this.name = name;
        this.location = location;
        this.artworks = artworks;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Artwork[] getArtworks() {
        return artworks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setArtworks(Artwork[] artworks) {
        this.artworks = artworks;
    }

    public void showGallery() {
        System.out.println("Gallery: " + name + " (" + location + ")");
        System.out.println("Artworks on display:");
        for (Artwork a : artworks) {
            System.out.println("- " + a.getTitle() + " by " + a.getArtist().getName());
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class ArtGallery {

    private String name;
    private ArrayList<Artwork> artworks = new ArrayList<>();

    public ArtGallery(String name) {
        this.name = name;
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void showGallery() {
        System.out.println("Gallery: " + name);
        for (Artwork a : artworks) {
            System.out.println(a);
        }
    }

    public Artwork searchByTitle(String title) {
        for (Artwork a : artworks) {
            if (a.getTitle().equalsIgnoreCase(title)) {
                return a;
            }
        }
        return null;
    }

    public void filterByYear(int year) {
        for (Artwork a : artworks) {
            if (a.getYear() == year) {
                System.out.println(a);
            }
        }
    }

    public void sortByPrice() {
        Collections.sort(artworks);
    }
}




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

    public void compareArtworkPrices(Artwork a1, Artwork a2) {
        if (a1.getPrice() > a2.getPrice()) {
            System.out.println(a1.getTitle() + " is more expensive than " + a2.getTitle());
        } else if (a1.getPrice() < a2.getPrice()) {
            System.out.println(a2.getTitle() + " is more expensive than " + a1.getTitle());
        } else {
            System.out.println("Both artworks have the same price.");
        }
    }
}

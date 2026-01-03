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

        public.void.compare(art1, art2){
            if(price.art1>price.art2) System.out.println("art1 price is higher ");{
            }else if(price.art1<price.art2) System.out.println("art2 price is lower");
            }else { System.out.println("They are equal");
        }
    }
}



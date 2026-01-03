public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Vincent van Gogh", "Dutch", 1853);
        Artist artist2 = new Artist("Pablo Picasso", "Spanish", 1881);

        Artwork art1 = new Artwork("Starry Night", 1889, 1000000, artist1);
        Artwork art2 = new Artwork("Guernica", 1937, 2000000, artist2);

        Artwork[] artworks = { art1, art2 };

        ArtGallery gallery = new ArtGallery("Modern Art Museum", "Paris", artworks);

        gallery.showGallery();
        System.out.println();

        art1.showInfo();
        System.out.println();
        art2.showInfo();
        System.out.println();

        gallery.compareArtworkPrices(art1, art2);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Artist artist1 = new Artist("Van Gogh", "Dutch", 1853);
        Artist artist2 = new Artist("Picasso", "Spanish", 1881);

        ArtGallery gallery = new ArtGallery("Modern Art Gallery");

        gallery.addArtwork(new Artwork("Starry Night", 1889, 1000000, artist1));
        gallery.addArtwork(new Artwork("Guernica", 1937, 2000000, artist2));

        gallery.showGallery();

        System.out.print("\nEnter title to search: ");
        String title = scanner.nextLine();

        Artwork found = gallery.searchByTitle(title);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Artwork not found");
        }

        System.out.println("\nSorted by price:");
        gallery.sortByPrice();
        gallery.showGallery();
    }
}

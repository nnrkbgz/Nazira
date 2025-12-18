public class Artist {
    private String name;
    private String nationality;
    private int birthYear;

    public Artist(String name, String nationality, int birthYear) {
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
    }


    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void showInfo() {
        System.out.println("Artist: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Birth Year: " + birthYear);
    }
}

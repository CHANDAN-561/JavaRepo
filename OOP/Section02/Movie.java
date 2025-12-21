package OOP.Section02;

public class Movie {
    private String name;
    private String format;
    private double rating;

    //constructor
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    //copy constructor
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }


    //getters
    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFormat (String format) {
        this.format = format;
    }

    public void setRating (double rating) {
        this.rating = rating;
    }


    //to String method
    public String toString() {
        return "\n" + this.rating + "\t\t" + this.format + "\t\t" + this.name + "";
    }

}

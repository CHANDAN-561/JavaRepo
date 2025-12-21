package OOP.Section02;

public class Store {
    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie (int index) {
        return movies[index];
    }

    public void setMovie (int index, Movie movies) {
        this.movies[index] = movies;
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}

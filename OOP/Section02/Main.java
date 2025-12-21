package OOP.Section02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Store store = new Store();
        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather- Part II", "DVD    ", 9.0),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD    ", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD    ", 8.8),
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD    ", 8.8)
        };

        //movies setter
        for (int i = 0; i < movies.length; i++) {
            store.setMovie (i, movies[i]);
        }

        //print movies list
       printMovieList (movies, store);

        //update the movie ratings
        System.out.print("\n\nTo edit a rating, type: 'continue': ");
        String input = scan.next();
        while (input.equals ("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int index = scan.nextInt();
           // Movie userIntendedMovie = store.getMovie (index);

            System.out.print("\nSet a new rating for the movie (" + movies[index].getName() + "): ");
            double newRating = scan.nextDouble();
            store.getMovie(index).setRating (newRating);

//            System.out.println(store.movies[index].rating);

            System.out.println("Sucessfully changed the rating of (" + movies[index].getName() + ") to " + newRating);

            System.out.print("\nTo edit another rating, type: 'continue': ");
            input = scan.next();
        }

        printMovieList (movies, store);

        scan.close();
    }

    public static void printMovieList (Movie[] movies, Store store) {
        System.out.println("\n\n****************************** MOVIE STORE *****************************");
        for (int i = 0; i < movies.length; i++) {
            System.out.print(store.getMovie(i));
        }
    }
}

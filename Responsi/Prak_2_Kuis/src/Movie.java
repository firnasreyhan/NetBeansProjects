
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rey
 */
public class Movie {
    String judulFilm;
    String genre;
    int tahunRilis;

    public Movie(String judulFilm, String genre, int tahunRilis) {
        this.judulFilm = judulFilm;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }
    
    public static void print(ArrayList<Movie> film) {
        for (int i = 0; i < film.size(); i++) {
            System.out.println((i+1) + ".\t||  " + film.get(i).judulFilm + "  ||  " 
                    + film.get(i).genre + "  ||  " + film.get(i).tahunRilis);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Movie> film = new ArrayList<Movie>();
        film.add(new Movie("Iron Man", "Action", 2008));
        film.add(new Movie("The Incredible Hulk", "Action", 2008));
        film.add(new Movie("Iron Man 2", "Action", 2010));
        film.add(new Movie("Thor", "Action", 2011));
        film.add(new Movie("Captain America: The First Avenger", "Action", 2011));
        film.add(new Movie("Marvel's The Avengers", "Action", 2012));
        film.add(new Movie("Iron Man 3", "Action", 2013));
        film.add(new Movie("Thor: The Dark World", "Action", 2013));
        film.add(new Movie("Captain America: The Winter Soldier", "Action", 2014));
        film.add(new Movie("Guardians of the Galaxy", "Action", 2014));
        film.add(new Movie("Avengers: Age of Ultron", "Action", 2015));
        film.add(new Movie("Ant-Man", "Action", 2015));
        film.add(new Movie("Captain America: Civil War", "Action", 2016));
        film.add(new Movie("Doctor Strange", "Action", 2016));
        film.add(new Movie("Guardians of the Galaxy Vol. 2", "Action", 2017));
        print(film);
    }
    
}

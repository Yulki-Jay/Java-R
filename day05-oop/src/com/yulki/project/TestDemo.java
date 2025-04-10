package com.yulki.project;

public class TestDemo {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        Movie m1 = new Movie("Avengers", 1, 100);
        Movie m2 = new Movie("Harry Potter", 2, 100);
        Movie m3 = new Movie("Star Wars", 3, 100);

        movies[0] = m1;
        movies[1] = m2;
        movies[2] = m3;

        MovieOperator movieOperator = new MovieOperator(movies, 3);
        movieOperator.get_info(2);

    }
}

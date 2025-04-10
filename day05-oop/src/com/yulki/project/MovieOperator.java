package com.yulki.project;

public class MovieOperator {
    private Movie[] movies;
    private int count;

    public MovieOperator(Movie[] movies,int count) {
        this.movies = movies;
        this.count = count;
    }

    public void get_info(int id){
        movies[id].get_info();
    }
}

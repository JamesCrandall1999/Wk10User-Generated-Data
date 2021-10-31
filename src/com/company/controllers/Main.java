package com.company.controllers;


import com.company.models.Movie;
import com.company.views.UserView;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        UserView view = new UserView();
        DBConnect db = new DBConnect("movies.db");
        db.createNewDatabase();
        db.addTables();
        db.addData("Star Wars", "1977", "PG");
        db.addData("CODA", "2021", "PG-13");
        db.addData("The Life of Emile Zola", "1937", "NR");
        db.addData("The Night House", "2021", "R");

        String title = view.inputTitle();
        String releaseYear = view.inputReleaseYear();
        String rating = view.inputRating();
        db.addData(title, releaseYear, rating);

        ArrayList<Movie> theMovies = db.getData();
        view.showMovies(theMovies);
        /*for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }
        */

    }


}
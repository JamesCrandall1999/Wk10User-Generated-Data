package com.company.views;

import com.company.models.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    String input;

    public String inputTitle(){
        System.out.println("Enter Movie Title: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();


    }
    public String inputReleaseYear(){
        System.out.println("Enter Release Year: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }
    public String inputRating(){
        System.out.println("Enter Rating: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }
    public void showMovies(ArrayList<Movie> theMovies){
        for(Movie movie : theMovies){
            System.out.println(movie.toString());
        }


    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}

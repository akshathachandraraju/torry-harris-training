package com.torryharris.driver;

import com.torryharris.comparator.MovieCollectionsComparator;
import com.torryharris.comparator.MovieYearComparator;
import com.torryharris.comparator.MovieIMDBComparator;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie("Shershah", 2021, 8.7f, 110.1f);
        Movie m2 = new Movie("Kabhir singh", 2020, 7.8f, 98.5f);
        Movie m3 = new Movie("Chhichore", 2019, 8.0f, 100.0f);
        Movie m4 = new Movie("3 Idiots", 2015, 8.2f, 103.4f);
        Movie m5 = new Movie("Padmavat", 2018, 8.3f, 100.7f);
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sorting options:\n 1.Title \n 2.Year \n 3.IMDB Ratings \n 4.Collections\n Enter option:");
        i = sc.nextInt();
        if (i == 1) {
            System.out.println("Sorting by Movie Title:");
            movieList.sort(null);
            Iterator<Movie> movieIterator = movieList.iterator();
            while (movieIterator.hasNext())
                System.out.println(movieIterator.next());
            System.out.println();
        }
            else if (i == 2) {
                System.out.println("Sorting by Movie Year:");
                movieList.sort(new MovieYearComparator());
                Iterator<Movie> movieIterator = movieList.iterator();
                while (movieIterator.hasNext())
                    System.out.println(movieIterator.next());
                System.out.println();
            } else if (i == 3) {
                System.out.println("Sorting by Movie IMDB ratings:");
                movieList.sort(new MovieIMDBComparator());
                Iterator<Movie> movieIterator = movieList.iterator();
                while (movieIterator.hasNext())
                    System.out.println(movieIterator.next());
                System.out.println();
            } else if (i == 4) {
                System.out.println("Sorting by Movie Collections:");
                movieList.sort(new MovieCollectionsComparator());
                Iterator<Movie> movieIterator = movieList.iterator();
                while (movieIterator.hasNext())
                    System.out.println(movieIterator.next());
                System.out.println();
            } else
                System.out.println("Invalid input!!!");
        }
    }


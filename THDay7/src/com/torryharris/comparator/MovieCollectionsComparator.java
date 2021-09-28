package com.torryharris.comparator;

import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieCollectionsComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Float.compare(o2.getMcollections(), o1.getMcollections());
    }
}
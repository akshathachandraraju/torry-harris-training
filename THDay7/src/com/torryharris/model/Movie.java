package com.torryharris.model;

public class Movie implements Comparable<Movie>{
   private String title;
   private int year;
   private float imdbRating;
   private float mcollections;

   public Movie(String title, int year, float imdbRating, float mcollections) {
      this.title = title;
      this.year = year;
      this.imdbRating = imdbRating;
      this.mcollections = mcollections;
   }

   @Override
   public int compareTo(Movie o) {
      return this.title.compareTo(o.title);
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public float getImdbRating() {
      return imdbRating;
   }

   public void setImdbRating(float imdbRating) {
      this.imdbRating = imdbRating;
   }

   public float getMcollections() {
      return mcollections;
   }

   public void setMcollections(float mcollections) {
      this.mcollections = mcollections;
   }

   @Override
   public String toString() {
      return "Movie{" +
              "title='" + title + '\'' +
              ", year=" + year +
              ", imdbRating=" + imdbRating +
              ", mcollections=" + mcollections +
              '}';
   }
}

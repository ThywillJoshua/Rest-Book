package org.agoncal.quarkus.starting;

public class Book {
  public int id;
  public String author;
  public String title;
  public int year;
  public String genre;


    public Book(int id, String author, String title, int year, String genre) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
}

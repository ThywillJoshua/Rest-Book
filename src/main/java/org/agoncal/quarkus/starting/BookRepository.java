package org.agoncal.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@ApplicationScoped
public class BookRepository {


    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "George Orwell", "1984", 1949, "Dystopian"));
        books.add(new Book(2, "J.R.R. Tolkien", "The Hobbit", 1937, "Fantasy"));
        books.add(new Book(3, "Harper Lee", "To Kill a Mockingbird", 1960, "Fiction"));
        books.add(new Book(4, "F. Scott Fitzgerald", "The Great Gatsby", 1925, "Classics"));
        books.add(new Book(5, "Mary Shelley", "Frankenstein", 1818, "Gothic Fiction"));

        return books;
    }

    public Optional<Book> getBookByID(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }

}

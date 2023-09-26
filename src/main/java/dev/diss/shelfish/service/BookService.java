package dev.diss.shelfish.service;

import dev.diss.shelfish.model.Book;

import java.util.Set;

public interface BookService {

    Set<Book> getAllBooks();

    Book addBook(Book book);

    Book getBookById(Long id);

    Book updateBook(Long id, Book book);

    void deleteBook(Long id);
}

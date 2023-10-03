package dev.diss.shelfish.service;

import dev.diss.shelfish.model.Author;
import dev.diss.shelfish.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface AuthorService {

    Author getAuthorById(Long id);

    List<Author> getAllAuthors();

    boolean addAuthor(Author author);

    void deleteAuthorById(Long id);

    Author updateAuthor(Author author, Long id);

    Book getOneAuthorBook(Long authorId, Long bookId);

    Set<Book> getAllAuthorBooks(Long id);

    List<Author> findAll();
}

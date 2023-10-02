package dev.diss.shelfish.service;

import dev.diss.shelfish.model.Author;
import dev.diss.shelfish.model.Book;
import dev.diss.shelfish.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public boolean addAuthor(Author author) {

        // TODO: validate author presence
        if (author == null) {
            return false;
        }
        if (authorRepository.existsById(author.getId())) {
            // exists, skip
            return false;
        }

        Author newAuthor = new Author();

        authorRepository.save(newAuthor);

        return true;
    }

    @Override
    public void deleteAuthorById(Long id) {

        authorRepository.deleteById(id);

        System.out.printf("Author ID: %s", id);

    }

    @Override
    public Author updateAuthor(Author author, Long id) {
        return null;
    }

    @Override
    public Book getOneAuthorBook(Long authorId, Long bookId) {

        Author author = authorRepository.findById(authorId).orElse(null);
        if (author == null) {return null;}

        return author.getBookById(bookId);
    }

    @Override
    public Set<Book> getAllAuthorBooks(Long id) {

        Author author = authorRepository.findById(id).orElse(null);
        if (author == null) {return null;}

        return author.getBooks();
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}

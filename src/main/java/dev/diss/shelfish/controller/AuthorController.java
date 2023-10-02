package dev.diss.shelfish.controller;

import dev.diss.shelfish.model.Author;
import dev.diss.shelfish.repository.AuthorRepository;
import dev.diss.shelfish.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    // TODO: Map POST request to params
    @GetMapping("/new")
    public Author createNewAuthor() {

        // validate params, then drop into service
        Author newAuthor = new Author();

        // TODO: use setters to set data to Author object

        authorRepository.save(newAuthor);

        return newAuthor;
    }
}

package dev.diss.shelfish.controller;

import dev.diss.shelfish.model.Book;
import dev.diss.shelfish.model.Genre;
import dev.diss.shelfish.repository.GenreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/genre")
public class GenreController {

    private GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping("/")
    public List<Genre> getGenres() {
        return genreRepository.findAll();
    }

    @GetMapping("/{genreId}")
    public List<Book> getBooksByGenre(@PathVariable Long genreId) {
        return null;
    }

}

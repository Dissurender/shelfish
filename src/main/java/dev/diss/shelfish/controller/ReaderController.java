package dev.diss.shelfish.controller;

import dev.diss.shelfish.model.Book;
import dev.diss.shelfish.model.Reader;
import dev.diss.shelfish.model.Shelf;
import dev.diss.shelfish.repository.ReaderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/reader")
public class ReaderController {

    private ReaderRepository readerRepository;

    public ReaderController(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @GetMapping("/{readerId}")
    public Reader getReaderById(@PathVariable Long readerId) {
        return readerRepository.findById(readerId).orElse(null);
    }

    @GetMapping("/{readerId}/shelf")
    public Shelf getReaderShelf(@PathVariable Long readerId) {

        Reader reader = readerRepository.findById(readerId).orElse(null);

        // Validate if user exists and whether their shelf has been initialized
        if (reader == null) {
            return null;
        } else if (reader.getShelf().getBooks().isEmpty()) {
            reader.setShelf(new Shelf());
        }

        return reader.getShelf();
    }
}

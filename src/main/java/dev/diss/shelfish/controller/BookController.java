package dev.diss.shelfish.controller;

import dev.diss.shelfish.model.Book;
import dev.diss.shelfish.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(name = "title", required = false) String title) {
        if (title != null) {
            return bookService.searchTitleAndAuthor(title, "");
        } else if (title != null) {
            return bookService.searchTitle(title);
        }
        return null;
    }

    // TODO: pass params from frontend and instance new Book
    @PostMapping("/new")
    public Book createNewBook() {

        // TODO: Validate data received

        Book newBook = new Book();

        // TODO: Apply data from POST to object

        bookService.addBook(newBook);

        return newBook;
    }

}

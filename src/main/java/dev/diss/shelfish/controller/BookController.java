package dev.diss.shelfish.controller;

import dev.diss.shelfish.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;


}

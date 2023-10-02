package dev.diss.shelfish.controller;

import dev.diss.shelfish.model.Shelf;
import dev.diss.shelfish.repository.ShelfRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *
 *  This controller is for testing only, all shelves should be retrieved
 *  through the Reader who owns it
 */
@RestController
@RequestMapping("/api/shelves")
public class ShelfController {

    private ShelfRepository shelfRepository;

    public ShelfController(ShelfRepository shelfRepository) {
        this.shelfRepository = shelfRepository;
    }

    @GetMapping("/")
    public List<Shelf> getAllShelves() {
        return shelfRepository.findAll();
    }
}

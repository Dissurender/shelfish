package dev.diss.shelfish.repository;

import dev.diss.shelfish.model.Shelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelfRepository extends JpaRepository<Shelf, Long> {
}

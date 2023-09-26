package dev.diss.shelfish.repository;

import dev.diss.shelfish.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}

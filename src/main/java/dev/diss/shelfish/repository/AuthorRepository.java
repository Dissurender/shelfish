package dev.diss.shelfish.repository;

import dev.diss.shelfish.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

package com.gabriel.library.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import com.gabriel.library.domain.entities.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, UUID> {
}

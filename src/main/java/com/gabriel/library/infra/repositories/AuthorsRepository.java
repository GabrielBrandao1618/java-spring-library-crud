package com.gabriel.library.infra.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.library.domain.entities.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, UUID> {}

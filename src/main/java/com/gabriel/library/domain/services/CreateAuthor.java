package com.gabriel.library.domain.services;

import com.gabriel.library.domain.entities.Author;
import com.gabriel.library.infra.repositories.AuthorsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAuthor {
  @Autowired
  public AuthorsRepository authorsRepository;

  public Author run(String name) {
    Author author = new Author(name);
    this.authorsRepository.save(author);
    return author;
  }
}

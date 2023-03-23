package com.gabriel.library.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.library.infra.repositories.AuthorsRepository;
import com.gabriel.library.domain.entities.Author;

@Service
public class ListAuthors {

  @Autowired
  public AuthorsRepository authorsRepository;

  public List<Author> run() {
    return this.authorsRepository.findAll();
  }
}

package com.gabriel.library.domain.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.library.domain.entities.Author;
import com.gabriel.library.domain.entities.Book;
import com.gabriel.library.infra.repositories.AuthorsRepository;
import com.gabriel.library.infra.repositories.BooksRepository;

@Service
public class CreateBook {
  @Autowired
  BooksRepository booksRepository;
  @Autowired
  AuthorsRepository authorsRepository;
  public Book run(String name, UUID authorId) {
    Author foundAuthor = this.authorsRepository.findById(authorId).orElseThrow();
    Book book = new Book(name, foundAuthor);
    this.booksRepository.save(book);
    return book;
  }
}

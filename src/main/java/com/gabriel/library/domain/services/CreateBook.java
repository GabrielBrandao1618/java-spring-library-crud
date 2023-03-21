package com.gabriel.library.domain.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.library.domain.entities.Book;
import com.gabriel.library.infra.repositories.BooksRepository;

@Service
public class CreateBook {
  @Autowired
  BooksRepository booksRepository;
  public Book run(String name, UUID authorId) {
    Book book = new Book(name, authorId);
    this.booksRepository.save(book);
    return book;
  }
}

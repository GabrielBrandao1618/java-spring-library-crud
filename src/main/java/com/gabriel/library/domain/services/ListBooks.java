package com.gabriel.library.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.library.domain.entities.Book;
import com.gabriel.library.infra.repositories.BooksRepository;

@Service
public class ListBooks {
  @Autowired
  BooksRepository booksRepository;
  public List<Book> run() {
    return this.booksRepository.findAll();
  }
}

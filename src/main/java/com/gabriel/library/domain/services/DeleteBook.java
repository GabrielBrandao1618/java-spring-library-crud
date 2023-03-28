package com.gabriel.library.domain.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.library.infra.repositories.BooksRepository;

@Service
public class DeleteBook {
  @Autowired
  BooksRepository booksRepository;
  public void run(UUID bookId) {
    this.booksRepository.deleteById(bookId);
  }
}

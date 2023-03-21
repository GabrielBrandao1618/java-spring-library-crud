package com.gabriel.library.infra.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import com.gabriel.library.domain.entities.Book;
import com.gabriel.library.domain.services.CreateBook;
import com.gabriel.library.domain.services.ListBooks;
import com.gabriel.library.infra.dtos.CreateBookDTO;

@RestController
@RequestMapping("/book")
public class BooksController {
  @Autowired
  CreateBook createBook;
  @Autowired
  ListBooks listBooks;
  @GetMapping
  public List<Book> handleListBooks() {
    return this.listBooks.run();
  }
  @PostMapping
  public Book handleCreateBook(@RequestBody CreateBookDTO body) {
    Book createdBook = this.createBook.run(body.title, body.authorId);
    return createdBook;
  }
}

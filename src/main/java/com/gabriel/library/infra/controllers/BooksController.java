package com.gabriel.library.infra.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import com.gabriel.library.domain.entities.Book;
import com.gabriel.library.domain.services.CreateBook;
import com.gabriel.library.domain.services.DeleteBook;
import com.gabriel.library.domain.services.ListBooks;
import com.gabriel.library.infra.dtos.CreateBookDTO;
import com.gabriel.library.infra.dtos.DeleteBookDTO;

@RestController
@RequestMapping("/book")
public class BooksController {
  CreateBook createBook;
  ListBooks listBooks;
  DeleteBook deleteBook;

  @Autowired
  public BooksController(ListBooks listBooks, CreateBook createBook, DeleteBook deleteBook) {
    this.createBook = createBook;
    this.deleteBook = deleteBook;
    this.listBooks = listBooks;
  }

  @GetMapping
  public List<Book> handleListBooks() {
    return this.listBooks.run();
  }
  @PostMapping
  public Book handleCreateBook(@RequestBody CreateBookDTO body) {
    Book createdBook = this.createBook.run(body.title, body.authorId);
    return createdBook;
  }
  @DeleteMapping
  public void handleDeleteBook(@RequestBody DeleteBookDTO body) {
    this.deleteBook.run(body.bookId);
  }
}

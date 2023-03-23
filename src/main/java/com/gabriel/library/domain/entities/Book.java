package com.gabriel.library.domain.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "Book")
@Table(name = "book")
public class Book {
  @Id
  public UUID id;
  public String title;
  @ManyToOne
  @JoinColumn(name = "author_id")
  private Author author;

  public Book() {}

  public Book(String title, Author author) {
    this.author = author;
    this.id = UUID.randomUUID();
    this.title = title;
  }

  public UUID getId() {
    return this.id;
  }
  public UUID getAuthorId() {
    return this.author.getId();
  }
  public String getTitle() {
    return this.title;
  }
}

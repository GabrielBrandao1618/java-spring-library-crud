package com.gabriel.library.domain.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  public UUID id;
  public String title;
  public UUID authorId;

  public Book() {}

  public Book(String title, UUID authorId) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.authorId = authorId;
  }

  public UUID getId() {
    return this.id;
  }
  public UUID getAuthorId() {
    return this.authorId;
  }
  public String getTitle() {
    return this.title;
  }
}

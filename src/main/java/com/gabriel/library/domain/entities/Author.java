package com.gabriel.library.domain.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Author")
@Table(name = "author")
public class Author {
  public String name;
  @Id
  public UUID id;

  @OneToMany(mappedBy = "author")
  public List<Book> books;

  public Author() {}

  public Author(String name) {
    this.name = name;
    this.id = UUID.randomUUID();
  }

  public UUID getId() {
    return this.id;
  }

}

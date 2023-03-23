package com.gabriel.library.infra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.library.domain.entities.Author;
import com.gabriel.library.domain.services.CreateAuthor;
import com.gabriel.library.domain.services.ListAuthors;
import com.gabriel.library.infra.dtos.CreateAuthorDTO;

@RestController
@RequestMapping("author")
public class AuthorsController {
  @Autowired
  public CreateAuthor createAuthor;
  @Autowired
  public ListAuthors listAuthors;

  @GetMapping
  List<Author> handleListAuthors() {
    return this.listAuthors.run();
  }

  @PostMapping
  Author handleCreateAuthor(@RequestBody CreateAuthorDTO body) {
    return this.createAuthor.run(body.name);
  }
}

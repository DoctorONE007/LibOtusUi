package com.example.libotusui.service;

import com.example.libotusui.entity.Author;

import java.util.List;

public interface AuthorService {

    Author getById(long id);

    List<Author> getAll();

    Author getByName(String name);

    void insert(Author author);
}

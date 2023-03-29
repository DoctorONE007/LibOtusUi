package com.example.libotusui.service;

import com.example.libotusui.entity.Book;

import java.util.List;

public interface BookService {
    Book getById(long id);

    Book findByTitle(String title);

    List<Book> getAll();

    void insert(Book book);
}

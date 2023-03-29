package com.example.libotusui.service;

import com.example.libotusui.entity.Genre;

import java.util.List;

public interface GenreService {
    Genre getById(long id);

    Genre findByTitle(String title);

    List<Genre> getAll();

    void insert(Genre genre);
}

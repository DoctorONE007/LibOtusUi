package com.example.libotusui.service;

import com.example.libotusui.entity.Genre;
import com.example.libotusui.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    GenreRepository repository;

    @Override
    public Genre getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Genre findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public List<Genre> getAll() {
        return repository.findAll();
    }

    @Override
    public void insert(Genre genre) {
        repository.save(genre);
    }
}

package com.example.libotusui.service;

import com.example.libotusui.entity.Author;
import com.example.libotusui.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    AuthorRepository repository;

    @Override
    public Author getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Author> getAll() {
        return repository.findAll();
    }

    @Override
    public Author getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void insert(Author author) {
        repository.save(author);
    }
}

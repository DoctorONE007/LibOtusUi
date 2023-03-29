package com.example.libotusui.repository;

import com.example.libotusui.entity.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@ActiveProfiles("test")
class AuthorRepositoryTest {

    @Autowired
    private AuthorRepository authorRepository;

    @DirtiesContext
    @Test
    void getById() {
        Author author = new Author(1L, "Drew");
        assertNull(authorRepository.findById(1L).orElse(null));
        authorRepository.save(author);
        assertEquals("Drew", authorRepository.findById(1L).orElseThrow().getName());
    }

    @DirtiesContext
    @Test
    void findAll() {
        Author author = new Author("Drew");
        assertEquals(0, authorRepository.findAll().size());
        authorRepository.save(author);
        assertEquals("Drew", authorRepository.findAll().get(0).getName());
        assertEquals(1, authorRepository.findAll().size());
    }

    @DirtiesContext
    @Test
    void findByName() {
        Author author = new Author("Drew");
        assertNull(authorRepository.findByName("Drew"));
        authorRepository.save(author);
        assertEquals("Drew", authorRepository.findByName("Drew").getName());
    }

    @DirtiesContext
    @Test
    void insert() {
        Author author = new Author("Drew");
        assertNull(authorRepository.findByName("Drew"));
        authorRepository.save(author);
        assertEquals("Drew", authorRepository.findByName("Drew").getName());
    }
}
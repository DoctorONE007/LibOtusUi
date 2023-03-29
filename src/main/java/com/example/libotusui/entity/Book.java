package com.example.libotusui.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Book")
@Getter
@Setter
@ToString
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String title;

    public Book(String title) {
        this.title = title;
    }
}

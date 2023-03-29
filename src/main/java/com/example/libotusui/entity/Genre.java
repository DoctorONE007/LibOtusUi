package com.example.libotusui.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Genre")
@Getter
@Setter
@ToString
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String title;

    public Genre(String title) {
        this.title = title;
    }
}

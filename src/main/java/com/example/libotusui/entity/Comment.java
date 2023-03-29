package com.example.libotusui.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Comment")
@ToString
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private long id;

    private long bookId;

    private Timestamp time;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String text;

    public Comment(long bookId, Timestamp time, String text) {
        this.bookId = bookId;
        this.time = time;
        this.text = text;
    }
}

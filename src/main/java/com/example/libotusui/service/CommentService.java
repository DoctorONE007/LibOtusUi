package com.example.libotusui.service;

import com.example.libotusui.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment getById(long id);

    Comment findByText(String text);

    Comment findByBookId(long bookId);

    List<Comment> getAll();

    void insert(Comment comment);
}

package com.example.libotusui.repository;

import com.example.libotusui.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findByText(String text);

    Comment findByBookId(long bookId);
}

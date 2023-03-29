DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS books;
DROP TABLE IF EXISTS genres;
DROP TABLE IF EXISTS authors_books_genres;
CREATE TABLE authors
(
    id   bigint PRIMARY KEY auto_increment,
    name varchar(255)
);

CREATE TABLE books
(
    id    bigint PRIMARY KEY auto_increment,
    title varchar(255)
);

CREATE TABLE genres
(
    id    bigint PRIMARY KEY auto_increment,
    title varchar(255)
);

CREATE TABLE authors_books_genres
(
    id       bigint PRIMARY KEY auto_increment,
    authorId bigint,
    bookId   bigint,
    genreId  bigint,
    foreign key (authorId) REFERENCES authors (id),
    foreign key (bookId) REFERENCES books (id),
    foreign key (genreId) REFERENCES genres (id)
);

CREATE TABLE comments
(
    id      int auto_increment,
    book_id int,
    time    timestamp,
    text    text,
    primary key (id),
    foreign key (book_id) references books (id)
);
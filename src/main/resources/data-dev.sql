insert into authors(name)
values ('Фёдор Тютчев');
insert into authors(name)
values ('Николай Гоголь');
insert into authors(name)
values ('Александр Пушкин');

insert into books(title)
values ('Повести Белкина (сборник)');
insert into books(title)
values ('Евгений Онегин');
insert into books(title)
values ('Сказка о царе Салтане');
insert into books(title)
values ('Федор Тютчев: Стихи');
insert into books(title)
values ('Федор Тютчев: Стихи детям');
insert into books(title)
values ('Вечера на хуторе близ Диканьки');
insert into books(title)
values ('Петербургские повести');

insert into genres(title)
values ('Классическая проза');
insert into genres(title)
values ('Литература 19 века');
insert into genres(title)
values ('Русская классика');
insert into genres(title)
values ('Древнерусская литература');

insert into authors_books_genres(authorId, bookId, genreId)
values (1, 4, 1);
insert into authors_books_genres(authorId, bookId, genreId)
values (1, 4, 4);
insert into authors_books_genres(authorId, bookId, genreId)
values (1, 5, 1);
insert into authors_books_genres(authorId, bookId, genreId)
values (2, 6, 2);
insert into authors_books_genres(authorId, bookId, genreId)
values (2, 7, 3);
insert into authors_books_genres(authorId, bookId, genreId)
values (3, 1, 1);
insert into authors_books_genres(authorId, bookId, genreId)
values (3, 1, 2);
insert into authors_books_genres(authorId, bookId, genreId)
values (3, 2, 2);
insert into authors_books_genres(authorId, bookId, genreId)
values (3, 3, 2);
insert into authors_books_genres(authorId, bookId, genreId)
values (3, 7, 3);
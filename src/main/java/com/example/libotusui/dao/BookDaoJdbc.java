//package com.example.libotus.dao;
//
//import com.example.libotus.entity.Book;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class BookDaoJdbc implements BookDaoRepository {
//
//    private final NamedParameterJdbcOperations jdbc;
//
//    public BookDaoJdbc(NamedParameterJdbcOperations jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    RowMapper<Book> rowMapper = (resultSet, i) ->{
//        Long id = resultSet.getLong("id");
//        String title = resultSet.getString("title");
//        return new Book(id, title);
//    };
//
//    @Override
//    public Book getById(long id) {
//        final Map<String, Object> params = Collections.singletonMap("id",id);
//        try {
//            return jdbc.queryForObject("select * from books where id = :id", params, rowMapper);
//        } catch (EmptyResultDataAccessException e){
//            System.out.println("Пусто");
//        }
//        return null;
//    }
//
//    @Override
//    public Book findByTitle(String title) {
//        final Map<String, Object> params = Collections.singletonMap("title",title);
//        try {
//            return jdbc.queryForObject("select * from books where title = :title", params, rowMapper);
//        } catch (EmptyResultDataAccessException e){
//            System.out.println("Пусто");
//        }
//        return null;
//    }
//
//    @Override
//    public List<Book> getAll() {
//        return jdbc.query("select * from books", rowMapper);
//    }
//
//    @Override
//    public void insert(Book book) {
//        final Map<String, Object> params = Collections.singletonMap("title", book.getTitle());
//        jdbc.update("insert into books (title) values :title", params);
//    }
//}

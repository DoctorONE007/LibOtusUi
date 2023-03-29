//package com.example.libotus.dao;
//
//import com.example.libotus.entity.Genre;
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
//public class GenreDaoJdbc implements GenreDaoRepository {
//
//    private final NamedParameterJdbcOperations jdbc;
//
//    public GenreDaoJdbc(NamedParameterJdbcOperations jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    RowMapper<Genre> rowMapper = (resultSet, i) ->{
//        Long id = resultSet.getLong("id");
//        String title = resultSet.getString("title");
//        return new Genre(id, title);
//    };
//
//    @Override
//    public Genre getById(long id) {
//        final Map<String, Object> params = Collections.singletonMap("id",id);
//        try {
//            return jdbc.queryForObject("select * from genres where id = :id", params, rowMapper);
//        } catch (EmptyResultDataAccessException e){
//            System.out.println("Пусто");
//        }
//        return null;
//    }
//
//    @Override
//    public Genre findByTitle(String title) {
//        final Map<String, Object> params = Collections.singletonMap("title",title);
//        try {
//            return jdbc.queryForObject("select * from genres where title = :title", params, rowMapper);
//        } catch (EmptyResultDataAccessException e){
//            System.out.println("Пусто");
//        }
//        return null;
//    }
//
//    @Override
//    public List<Genre> getAll() {
//        return jdbc.query("select * from genres", rowMapper);
//    }
//
//    @Override
//    public void insert(Genre genre) {
//        final Map<String, Object> params = Collections.singletonMap("title", genre.getTitle());
//        jdbc.update("insert into genres (title) values :title", params);
//    }
//}

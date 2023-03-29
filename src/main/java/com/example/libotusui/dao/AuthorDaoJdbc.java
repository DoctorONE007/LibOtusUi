//package com.example.libotus.dao;
//
//import com.example.libotus.entity.Author;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class AuthorDaoJdbc implements AuthorDaoRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//
////    private final NamedParameterJdbcOperations jdbc;
////
////    public AuthorDaoJdbc(NamedParameterJdbcOperations jdbc) {
////        this.jdbc = jdbc;
////    }
////
////    RowMapper<Author> rowMapper = (resultSet, i) ->{
////        Long id = resultSet.getLong("id");
////        String name = resultSet.getString("name");
////        return new Author(id, name);
////    };
//
//    @Override
//    public Author getById(long id) {
////        final Map<String, Object> params = Collections.singletonMap("id",id);
////        try {
////            return jdbc.queryForObject("select * from authors where id = :id", params, rowMapper);
////        } catch (EmptyResultDataAccessException e){
////            System.out.println("Пусто");
////        }
////        return null;
//        return em.find(Author.class,id);
//    }
//
//    @Override
//    public List<Author> getAll() {
//        return em.createQuery("select a from Author a", Author.class).getResultList();
////        return jdbc.query("select * from authors", rowMapper);
//    }
//
//    @Override
//    public Author getByName(String name) {
////        final Map<String, Object> params = Collections.singletonMap("name",name);
////        try {
////           return jdbc.queryForObject("select * from authors where name = :name", params, rowMapper);
////        } catch (EmptyResultDataAccessException e){
////            System.out.println("Пусто");
////        }
////        return null;
//        return em.createQuery("select a from Author a where a.name=:name", Author.class).setParameter("name", name).getSingleResult();
////        return em.find(Author.class,name);
//
//    }
//    @Transactional
//    @Override
//    public void insert(Author author) {
////        final Map<String, Object> params = Collections.singletonMap("name", author.getName());
////        jdbc.update("insert into authors (name) values :name", params);
//        em.merge(author);
//    }
//}

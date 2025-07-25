package com.system.Library_Management_System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.Library_Management_System.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    List<Book> findByGenre(String genre);
    

    

}

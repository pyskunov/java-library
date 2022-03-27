package com.example.demo.books.repositories;

import com.example.demo.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository
        extends JpaRepository<Book, Long> {

    @Query("SELECT book FROM Book book WHERE book.name = ?1")
    Optional<Book> findBookByName(String name);
}

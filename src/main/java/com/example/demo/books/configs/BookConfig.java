package com.example.demo.books.configs;

import com.example.demo.books.models.Book;
import com.example.demo.books.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            BookRepository bookRepository) {
        return args -> {
            Book book1 = new Book(
                    "book 1",
                    100
            );

            Book book2 = new Book(
                    "book 1",
                    100
            );

            bookRepository.saveAll(
                    List.of(book1, book2)
            );
        };
    }
}

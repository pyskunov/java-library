package com.example.demo.books.services;

import com.example.demo.books.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Book> books() {
        return List.of(
                new Book(
                        1L,
                        "book 1",
                        100
                ),
                new Book(
                        2L,
                        "book 2",
                        100
                )
        );
    }
}

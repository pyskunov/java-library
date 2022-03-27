package com.example.demo.books.services;

import com.example.demo.books.models.Book;
import com.example.demo.books.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> books() {
        return bookRepository.findAll();
    }

    public void save(Book book) {
        Optional<Book> bookOptional = bookRepository
                .findBookByName(book.getName());

        if (bookOptional.isPresent()) {
            throw new IllegalStateException("name taken");
        }

        bookRepository.save(book);
    }
}

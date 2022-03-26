package com.example.demo.books.models;

public class Book {
    private Long id;
    private String name;
    private Integer pages;

    public Book(Long id, String name, Integer pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public Book setPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}

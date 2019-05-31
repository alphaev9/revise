package com.revise.domain.repository;

import com.revise.domain.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getBooksByAuthor(String author);
    void addBook(Book book);
    void deleteBook(Integer id);
}

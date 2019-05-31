package com.revise.domain.service;

import com.revise.domain.model.Book;
import com.revise.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void onSale(Book book) {
        bookRepository.addBook(book);
    }

    public List<Book> count(String author) {
        List<Book> books = bookRepository.getBooksByAuthor(author);
        books.forEach(book -> System.out.println(book.getTitle()));
        return books;
    }

    public void off(Integer id) {
        System.out.println(id);
        bookRepository.deleteBook(id);
    }
}

package com.revise.app.persistence.mybatis;

import com.revise.domain.model.Book;

import java.util.List;

public interface BookMapper {
    void addBook(Book book);

    List<Book> queryByAuthor(String author);

    void delete(Integer id);
}

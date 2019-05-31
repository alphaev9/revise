package com.revise.app.persistence;

import com.revise.app.persistence.mybatis.BookMapper;
import com.revise.domain.model.Book;
import com.revise.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryOnMybatis implements BookRepository {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookMapper.queryByAuthor(author);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.delete(id);
    }
}

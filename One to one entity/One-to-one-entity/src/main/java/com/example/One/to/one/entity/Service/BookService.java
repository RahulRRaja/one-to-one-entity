package com.example.One.to.one.entity.Service;

import com.example.One.to.one.entity.model.Book;
import org.springframework.stereotype.Component;




@Component
public interface BookService {

    public Book saveBook(Book book);

    public Book findByBookId(int bookId);
}
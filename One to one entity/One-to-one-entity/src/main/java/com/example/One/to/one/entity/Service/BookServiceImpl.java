package com.example.One.to.one.entity.Service;

import com.example.One.to.one.entity.Repository.BookRepository;
import com.example.One.to.one.entity.model.Book;
import com.example.One.to.one.entity.model.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    @Autowired

    private BookRepository bookRepository;

    public Book saveBook(Book book) {

        Story story = book.getStory();
        story.setBook(book);
        book = bookRepository.save(book);
        return book;

    }

    public Book findByBookId(int bookId) {
        Book book = bookRepository.findByBookId(bookId);
        return book;
    }
}
package com.example.One.to.one.entity.Repository;

import com.example.One.to.one.entity.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface BookRepository extends JpaRepository<Book, String> {

    public Book findByBookId(int bookId);

}
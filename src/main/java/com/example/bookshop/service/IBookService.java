package com.example.bookshop.service;


import java.util.List;

import com.example.bookshop.model.Book;

public interface IBookService
{
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}

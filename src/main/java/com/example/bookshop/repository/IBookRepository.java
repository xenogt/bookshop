package com.example.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long>{}

package com.example.my_first_api.services;

import com.example.my_first_api.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}

package com.example.my_first_api.services;

import com.example.my_first_api.domain.Book;
import com.example.my_first_api.repositories.BookReposity;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{

  private final BookReposity bookReposity;

    public BookServiceImpl(BookReposity bookReposity) {
        this.bookReposity = bookReposity;
    }

    @Override
    public Iterable<Book> findAll(){
        return bookReposity.findAll();
    }


}

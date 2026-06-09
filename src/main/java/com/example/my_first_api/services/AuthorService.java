package com.example.my_first_api.services;

import com.example.my_first_api.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}

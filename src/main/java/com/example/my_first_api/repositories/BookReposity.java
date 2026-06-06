package com.example.my_first_api.repositories;

import com.example.my_first_api.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookReposity extends CrudRepository<Book, Long> {
}

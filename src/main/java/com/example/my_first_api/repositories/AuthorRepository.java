package com.example.my_first_api.repositories;
import com.example.my_first_api.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}


package com.example.my_first_api.repositories;

import com.example.my_first_api.domain.Author;
import com.example.my_first_api.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface DataJPArepositrory extends CrudRepository<Publisher, Long> {
}

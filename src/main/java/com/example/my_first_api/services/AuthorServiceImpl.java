package com.example.my_first_api.services;


import com.example.my_first_api.domain.Author;
import com.example.my_first_api.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authReposity;

    public AuthorServiceImpl(AuthorRepository authReposity) {
        this.authReposity = authReposity;
    }

    @Override
    public Iterable<Author> findAll(){
        return  authReposity.findAll();
    }


}

package com.example.my_first_api.bootstrap;

import com.example.my_first_api.domain.Author;
import com.example.my_first_api.domain.Book;
import com.example.my_first_api.repositories.AuthorRepository;
import com.example.my_first_api.repositories.BookReposity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookReposity bookReposity;

    public BootstrapData(AuthorRepository authorRepository, BookReposity bookReposity) {
        this.authorRepository = authorRepository;
        this.bookReposity = bookReposity;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("eric");
        eric.setLastName("Evans");

        Book book = new Book();
        book.settitle("dom");
        book.setIsbn("1234");

        AuthorRepository ericSavad = (AuthorRepository) authorRepository.save(eric);
        Book bookSaved = bookReposity.save(book);


        Author rod= new Author();
        rod.setFirstName("roc");
        rod.setLastName("Evns");

        Book book2 = new Book();
        book2.settitle("dom");
        book2.setIsbn("1234");

        AuthorRepository rodSavad = (AuthorRepository) authorRepository.save(eric);
        Book book2Saved = bookReposity.save(book);







    }
}
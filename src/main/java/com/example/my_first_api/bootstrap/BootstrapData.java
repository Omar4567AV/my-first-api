package com.example.my_first_api.bootstrap;

import com.example.my_first_api.domain.Author;
import com.example.my_first_api.domain.Book;
import com.example.my_first_api.domain.Publisher;
import com.example.my_first_api.repositories.AuthorRepository;
import com.example.my_first_api.repositories.BookReposity;
import com.example.my_first_api.repositories.DataJPArepositrory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookReposity bookReposity;
    private final DataJPArepositrory publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookReposity bookReposity, DataJPArepositrory publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookReposity = bookReposity;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("eric");
        eric.setLastName("Evans");

        Book book = new Book();
        book.setTitle("dom");
        book.setIsbn("1234");

        Author ericSaved = authorRepository.save(eric);
        Book bookSaved = bookReposity.save(book);

        Author rod = new Author();
        rod.setFirstName("roc");
        rod.setLastName("Evns");

        Book book2 = new Book();
        book2.setTitle("dom");
        book2.setIsbn("1234");

        Author rodSaved = authorRepository.save(rod);
        Book book2Saved = bookReposity.save(book2);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Omar");
        publisher.setAddress("New Jersey");
        publisher.setCity("Tripoli");
        publisher.setState("North");
        publisher.setZip("298TN");

        ericSaved.getBooks().add(bookSaved);
        rod.getBooks().add(book2Saved);

        Publisher publisher1UBLISHER = publisherRepository.save(publisher);

        bookSaved.setPublisher(publisher1UBLISHER);
        book2Saved.setPublisher(publisher1UBLISHER);

        authorRepository.save(rod);
        authorRepository.save(eric);
        bookReposity.save(bookSaved);
        bookReposity.save(book2Saved);

        System.out.println("IN Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookReposity.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}

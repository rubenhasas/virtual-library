package com.virtuallibrary.bootstrap;

import com.virtuallibrary.model.Author;
import com.virtuallibrary.model.Book;
import com.virtuallibrary.model.Publisher;
import com.virtuallibrary.services.AuthorService;
import com.virtuallibrary.services.BookService;
import com.virtuallibrary.services.PublisherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final AuthorService authorService;
    private final BookService bookService;
    private final PublisherService publisherService;

    public DataLoader(AuthorService authorService, BookService bookService, PublisherService publisherService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author();
        author1.setFirstName("Karl");
        author1.setLastName("May");

        authorService.save(author1);

        Author author2 = new Author();
        author2.setFirstName("Jack");
        author2.setLastName("London");

        authorService.save(author2);

        Publisher publisher = new Publisher();
        publisher.setName("Nemira");
        publisher.setAddress("Bucuresti");

        publisherService.save(publisher);

        Book book1 = new Book();
        book1.setIsbn("1234");
        book1.setPublisher(publisher);
        book1.setTitle("Winnetou");

        bookService.save(book1);

        Book book2 = new Book();
        book2.setIsbn("5254");
        book2.setPublisher(publisher);
        book2.setTitle("White fang");

        bookService.save(book2);

    }
}

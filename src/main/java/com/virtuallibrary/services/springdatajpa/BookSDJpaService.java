package com.virtuallibrary.services.springdatajpa;

import com.virtuallibrary.model.Book;
import com.virtuallibrary.repositories.BookRepository;
import com.virtuallibrary.services.BookService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookSDJpaService implements BookService {

    private final BookRepository bookRepository;

    public BookSDJpaService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Set<Book> findAll() {
        Set<Book> books = new HashSet<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    @Override
    public Book findById(Long aLong) {
        return bookRepository.findById(aLong).orElse(null);
    }

    @Override
    public Book save(Book object) {
        return bookRepository.save(object);
    }

    @Override
    public void delete(Book object) {
        bookRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bookRepository.deleteById(aLong);
    }
}

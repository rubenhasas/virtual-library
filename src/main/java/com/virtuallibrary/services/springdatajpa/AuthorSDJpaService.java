package com.virtuallibrary.services.springdatajpa;

import com.virtuallibrary.model.Author;
import com.virtuallibrary.repositories.AuthorRepository;
import com.virtuallibrary.repositories.BookRepository;
import com.virtuallibrary.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthorSDJpaService implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorSDJpaService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author findByLastName(String lastName) {
        return authorRepository.findByLastName(lastName);
    }

    @Override
    public Set<Author> findAll() {
        Set<Author> authors = new HashSet<>();
        authorRepository.findAll().forEach(authors::add);
        return authors;
    }

    @Override
    public Author findById(Long aLong) {
        return authorRepository.findById(aLong).orElse(null);
    }

    @Override
    public Author save(Author object) {
        return authorRepository.save(object);
    }

    @Override
    public void delete(Author object) {
        authorRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        authorRepository.deleteById(aLong);
    }
}

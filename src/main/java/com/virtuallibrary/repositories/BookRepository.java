package com.virtuallibrary.repositories;

import com.virtuallibrary.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByTitle (String title);
}

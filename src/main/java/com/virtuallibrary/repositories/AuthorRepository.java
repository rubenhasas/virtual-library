package com.virtuallibrary.repositories;

import com.virtuallibrary.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    Author findByLastName (String lastName);
}

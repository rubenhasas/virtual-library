package com.virtuallibrary.services;

import com.virtuallibrary.model.Author;

public interface AuthorService extends CrudService<Author, Long> {

    Author findByLastName(String lastName);

}


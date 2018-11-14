package com.virtuallibrary.services;

import com.virtuallibrary.model.Book;

public interface BookService extends CrudService<Book, Long> {

    Book findByTitle(String title);

}

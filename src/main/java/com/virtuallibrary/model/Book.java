package com.virtuallibrary.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Book extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id") )
    private Set<Author> authors = new HashSet<>();

}

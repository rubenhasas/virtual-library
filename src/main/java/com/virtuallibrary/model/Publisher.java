package com.virtuallibrary.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Publisher extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>();
}

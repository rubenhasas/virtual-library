package com.virtuallibrary.repositories;

import com.virtuallibrary.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

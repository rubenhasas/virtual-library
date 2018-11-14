package com.virtuallibrary.repositories;


import com.virtuallibrary.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

package com.virtuallibrary.services.springdatajpa;

import com.virtuallibrary.model.Publisher;
import com.virtuallibrary.repositories.PublisherRepository;
import com.virtuallibrary.services.PublisherService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PublisherSDJpaService implements PublisherService {

    public PublisherSDJpaService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    private final PublisherRepository publisherRepository;

    @Override
    public Publisher findByName(String name) {
        return publisherRepository.findByName(name);
    }

    @Override
    public Set<Publisher> findAll() {
        Set<Publisher> publishers = new HashSet<>();
        publisherRepository.findAll().forEach(publishers::add);
        return publishers;
    }

    @Override
    public Publisher findById(Long aLong) {
        return publisherRepository.findById(aLong).orElse(null);
    }

    @Override
    public Publisher save(Publisher object) {
        return publisherRepository.save(object);
    }

    @Override
    public void delete(Publisher object) {
        publisherRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        publisherRepository.deleteById(aLong);
    }
}

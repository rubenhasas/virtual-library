package com.virtuallibrary.services;

import com.virtuallibrary.model.Publisher;

public interface PublisherService extends CrudService<Publisher, Long> {

    Publisher findByName(String name);

}

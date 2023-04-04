package com.demo.cicd.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.cicd.model.Book;

public interface BookRepo extends MongoRepository<Book, String> {

}

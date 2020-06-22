package com.mike.example.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mike.example.springbootmongodbexample.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
  
}

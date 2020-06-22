package com.mike.example.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mike.example.springbootmongodbexample.model.Grade;

public interface GradeRepository extends MongoRepository<Grade, Integer> {
  
}

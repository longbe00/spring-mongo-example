package com.mike.example.springbootmongodbexample.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mike.example.springbootmongodbexample.model.Grade;
import com.mike.example.springbootmongodbexample.model.User;
import com.mike.example.springbootmongodbexample.repository.GradeRepository;
import com.mike.example.springbootmongodbexample.repository.UserRepository;

@EnableMongoRepositories(basePackages = "com.mike.example.*")
@Configuration
public class MongoDBConfig {

  @Bean
  CommandLineRunner insertUser(UserRepository usersRepository) {
    return strings -> {
      usersRepository.save(new User(1, "Varun", "Development", 2000L, 1));
      usersRepository.save(new User(2, "Deep", "IT", 1000L, 2));
    };
  }

  @Bean
  CommandLineRunner insertGrade(GradeRepository gradesRepository) {
    return strings -> {
      gradesRepository.save(new Grade(1, "GOOD", "A"));
      gradesRepository.save(new Grade(2, "BAD", "B"));
    };
  }
}

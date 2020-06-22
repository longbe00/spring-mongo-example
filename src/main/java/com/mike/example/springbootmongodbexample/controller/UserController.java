package com.mike.example.springbootmongodbexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mike.example.springbootmongodbexample.model.User;
import com.mike.example.springbootmongodbexample.repository.UserRepository;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    private UserRepository usersRepository;

    public UserController(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return usersRepository.findAll();
    }
    
}

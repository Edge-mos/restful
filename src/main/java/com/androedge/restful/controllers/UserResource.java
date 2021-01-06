package com.androedge.restful.controllers;

import com.androedge.restful.models.User;
import com.androedge.restful.services.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private final UserDaoService service;

    @Autowired
    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return this.service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return this.service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        final User save = this.service.save(user);

    }
}

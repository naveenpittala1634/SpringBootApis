package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@RestController
public class WelcomeController {
    DbUser db=new DbUser();

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<User> getAllUsers()
    {
        return db.getAllUsers();
    }

    @GetMapping("/usersbymodifyingresponse/{id}")
    public ResponseEntity<User> getAUser(@PathVariable int id) {
        User user1 = db.getAUser(id);
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.put("server", Collections.singletonList("CodeofNaveen"));
        HttpStatus status = HttpStatus.CREATED;
        ResponseEntity<User> response = new ResponseEntity<User>(user1, headers, status);
        return response;
    }

    @GetMapping("/users/{id}")
    public User getAllUsers(@PathVariable int id)
    {
        return db.getAUser(id);
    }

    @PostMapping("/addusers")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user)
    {
        return db.addUser(user);
    }
}


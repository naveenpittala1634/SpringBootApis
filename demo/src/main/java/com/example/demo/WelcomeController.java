package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WelcomeController {
    DbUser db=new DbUser();
//    @GetMapping("/welcome")
//    public String welcome()
//    {
//        return "Hi Naveen";
//    }

    @GetMapping("/users")
    public ArrayList<User> getAllUsers()
    {
        return db.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getAllUsers(@PathVariable int id)
    {
        return db.getAUser(id);
    }

    @PostMapping("/addusers")
    public User createUser(@RequestBody User user)
    {
        return db.addUser(user);
    }
}


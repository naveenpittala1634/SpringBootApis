package com.example.demo;

import java.util.ArrayList;

public class DbUser {
    private ArrayList<User> UserTable = new ArrayList<User>();
    public DbUser()
    {
        UserTable.add(new User(1,"Ramu",30));
        UserTable.add(new User(2,"Naveen",24));
        UserTable.add(new User(3,"Shankar",49));


    }
    public ArrayList<User> getAllUsers()
    {
        return UserTable;
    }

    public User getAUser(int id)
    {
        for(User user:UserTable)
        {
            if(user.getId()== id)
                return user;
        }
        return null;
    }

    public String addUser(User user)
    {
        UserTable.add(user);
        return "success";

    }



}

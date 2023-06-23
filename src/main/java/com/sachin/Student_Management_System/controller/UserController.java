package com.sachin.Student_Management_System.controller;

import com.sachin.Student_Management_System.model.User;
import com.sachin.Student_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //read
    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    //create
    @PostMapping("users")
    String addUsers(@RequestBody List<User> users)
    {
        return userService.createUsers(users);
    }

    //update
    @PutMapping("users")
    String updateUsers(@RequestBody List<User> users)
    {
        return userService.updateUsers(users);
    }

    //delete
    @DeleteMapping("users")
    String deleteUsers(@RequestBody List<User> users)
    {
        return userService.deleteUsers(users);
    }
}

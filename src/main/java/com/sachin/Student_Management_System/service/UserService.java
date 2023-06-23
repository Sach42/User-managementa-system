package com.sachin.Student_Management_System.service;

import com.sachin.Student_Management_System.model.User;
import com.sachin.Student_Management_System.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "New user added";
    }

    public String updateUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "New user upadted";
    }

    public String deleteUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "user deleted";
    }


}

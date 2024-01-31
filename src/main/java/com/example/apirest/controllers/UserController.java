package com.example.apirest.controllers;

import com.example.apirest.models.UserModel;
import com.example.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public UserModel addUser(@RequestBody UserModel user){
        return userService.addUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody UserModel user) {
        userService.deleteUser(user);
    }
}

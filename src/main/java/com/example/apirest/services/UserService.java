package com.example.apirest.services;

import com.example.apirest.models.UserModel;
import com.example.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel addUser(UserModel user){
        return userRepository.save(user);
    }

    public void deleteUser(UserModel user) {
        userRepository.deleteById(user.getId());
    }
}

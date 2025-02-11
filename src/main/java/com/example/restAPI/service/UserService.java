package com.example.restAPI.service;

import com.example.restAPI.model.User;
import com.example.restAPI.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){ return userRepository.findAll(); }

    public User createUser(User user){ return userRepository.save(user); }

    public void deleteUser(Long id) { userRepository.deleteById(id); }
}

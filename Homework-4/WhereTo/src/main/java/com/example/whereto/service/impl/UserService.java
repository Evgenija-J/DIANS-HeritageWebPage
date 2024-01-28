package com.example.whereto.service.impl;

import com.example.whereto.model.User;
import com.example.whereto.repository.implementation.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String username, String password, String email){

        if(username!=null && password!=null && email!=null){
            User user = new User();
            user.setUsername(username);
            user.setUsername(password);
            user.setUsername(email);
            return userRepository.save(user);
        }
        else return null;
    }

    public User authenthicate( String username, String password){
        return userRepository.findByUsernameAndPassword(username,password).orElse(null);
    }
}

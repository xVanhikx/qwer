package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User create(User user);
    public User getCurrentUser();
}

package com.tgc.integration.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgc.integration.user.User;
import com.tgc.integration.user.repo.UserRepository;
import com.tgc.integration.user.service.UserService;
 
@Service
public class UserServiceImpl  implements UserService {
 
    @Autowired
    UserRepository userRepository;
 
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}

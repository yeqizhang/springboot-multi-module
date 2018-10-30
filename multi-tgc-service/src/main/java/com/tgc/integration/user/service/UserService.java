package com.tgc.integration.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tgc.integration.user.User;

@Service
public  interface  UserService {
	
     List<User> list();
    	
}

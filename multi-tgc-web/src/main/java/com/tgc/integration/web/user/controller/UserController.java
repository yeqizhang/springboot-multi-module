package com.tgc.integration.web.user.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgc.integration.common.R;
import com.tgc.integration.user.service.UserService;
 

@RestController
@RequestMapping("/user/*")
public class UserController {
 
    @Autowired
    UserService userService;
 
    
    @GetMapping("list")
    public R list() {
        try {
            return R.isOk().data(userService.list());
        } catch (Exception e) {
            return R.isFail(e);
        }
        //http://localhost:8080/user/list
        //{"data":[{"userId":"1","username":"tgc","password":"666666"}],"status":0,"msg":""}
    }
 
}

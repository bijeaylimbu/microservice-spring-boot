package com.user.controller;

import com.user.entity.User;
import com.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService service;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        User user= this.service.getUser(userId);
        List locations= restTemplate.getForObject("http://localhost:9001/location/user/"+userId, List.class);
        user.setList(locations);
        return user;
    }
}

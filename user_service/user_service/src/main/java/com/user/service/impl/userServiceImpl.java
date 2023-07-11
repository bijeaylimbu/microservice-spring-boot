package com.user.service.impl;

import com.user.entity.User;
import com.user.service.userService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    List<User> userList= List.of(new User(11L, "Zex","11"),
            new User(12L, "Zexy","11")
            );
    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

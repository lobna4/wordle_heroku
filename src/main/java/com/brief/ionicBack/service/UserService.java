package com.brief.ionicBack.service;

import com.brief.ionicBack.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> userList();
}

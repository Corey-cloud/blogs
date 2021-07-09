package com.corey.blogs.service;

import com.corey.blogs.dao.UserRepository;
import com.corey.blogs.po.User;
import com.corey.blogs.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by corey on 2021/4/26
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUserNameAndPassword(username, password);
        return user;
    }
}

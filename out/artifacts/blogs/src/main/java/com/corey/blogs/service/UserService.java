package com.corey.blogs.service;

import com.corey.blogs.po.User;

public interface UserService {

    User checkUser(String username, String password);
}

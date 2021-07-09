package com.corey.blogs.dao;

import com.corey.blogs.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserNameAndPassword(String username, String password);
}

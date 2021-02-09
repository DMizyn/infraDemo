package com.infraDemo.demo.service.user;

import com.infraDemo.demo.entity.User;

import java.util.Optional;

public interface UserService {
    User saveOne(User user);
    boolean deleteUserById(long id) throws Exception;
    Optional<User> findById(Long id);
}

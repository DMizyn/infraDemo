package com.infraDemo.demo.controller;

import com.infraDemo.demo.entity.User;
import com.infraDemo.demo.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService service;

    @PostMapping(path = "/user")
    public User createUser(@RequestBody User user){
        return service.saveOne(user);
    }

    public String deleteById(long id){
        try {
            service.deleteUserById(id);
            return "OK";
        }catch (Exception e){
            return e.getMessage();
        }
    }
}

package com.infraDemo.demo.controller;

import com.infraDemo.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UsersControllerTest {

    @Autowired
    public UserController controller;

    @Test
    void createUser() {
        //GIVEN
        User user = new User();
        user.setName("Dominik");
        user.setLastName("Mizyn");
        //WHEN
        User actual = controller.createUser(user);
        //THEN
        assertNotNull(actual.getId());
        assertEquals("Dominik", actual.getName());
        assertEquals("Mizyn", actual.getLastName());
    }
}
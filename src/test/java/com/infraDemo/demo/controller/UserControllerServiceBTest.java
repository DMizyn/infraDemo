package com.infraDemo.demo.controller;

import com.infraDemo.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = "service.user=B")
class UserControllerServiceBTest {

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

    @Test
    void deleteById(){
        //GIVEN
        User user = new User();
        user.setName("Dominik");
        user.setLastName("Mizyn");
        //WHEN
        controller.createUser(user);
        String actual = controller.deleteById(user.getId());
        //THEN
        assertNotEquals("OK", actual);
        System.out.println("deleteById actual value:" + actual);
    }
}
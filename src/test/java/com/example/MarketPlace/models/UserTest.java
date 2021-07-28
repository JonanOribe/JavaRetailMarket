package com.example.MarketPlace.models;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UserTest {
    Date date = new Date();

    User user;

    @Test
    public void UserTestCreation() {
        user = new User("John","443224","john@gmail.com", date,2);
        assertEquals("John",user.getName());
    }
}

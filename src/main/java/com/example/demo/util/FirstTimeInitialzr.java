package com.example.demo.util;

import com.example.demo.security.AppUser;
import com.example.demo.security.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FirstTimeInitialzr implements CommandLineRunner {
    private final Log logger = LogFactory.getLog(FirstTimeInitialzr.class);
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");

        //check if we have users
        if(userService.findAll().isEmpty() ){
            logger.info("no users accounts found");

            AppUser user = new AppUser("ayoub@gmail.com", "password", "ayoub");
            userService.save(user);
        }
        //if no users exosts creat users
    }
}

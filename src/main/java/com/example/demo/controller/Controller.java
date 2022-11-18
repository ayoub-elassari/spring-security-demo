package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/")
    public String test(){
        return "test";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("/userauth")
    public String userauth(){
        return "hello";
    }
    @GetMapping("/adminauth")
    public String adminauth(){
        return "hello";
    }
}

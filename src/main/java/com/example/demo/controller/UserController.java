package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ChatService;
import com.example.demo.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService user;
    @Autowired
    private ChatService chatService;

    @GetMapping("/user/{id}")
    public String getUserByID(@PathVariable String id) {
        //middleware
        //if all passes call service
        return user.getUserName(id);
    }
    @GetMapping("/user/ai/{message}")
    public String prompt(@PathVariable String message) {
        return chatService.askAi(message);
    }
}

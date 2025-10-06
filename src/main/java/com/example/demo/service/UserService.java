package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getUserName(String id) {
        // Run a simple query that should return user name
        String result;
        try{
            result = jdbcTemplate.queryForObject("SELECT name FROM public.user", String.class);
        }catch(Error e){
            throw e;
        }
        if(result==null){
            throw new Error("user not found");
        }
        return result.toLowerCase();
    }
}

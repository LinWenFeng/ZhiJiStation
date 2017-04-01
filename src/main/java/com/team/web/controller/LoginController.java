package com.team.web.controller;

import com.team.domain.entity.User;
import com.team.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by BLACK on 2017/3/27.
 */
@RestController
@RequestMapping(value="/login")
public class LoginController {
    @Autowired
    private UserRepository repository;
    @PostMapping
    public Boolean loginHandle(User user, HttpSession session){
        Boolean isexists= repository.exists(Example.of(user));
        if(isexists){
            session.setAttribute("userName",user.getUsername());
        }
        return isexists;
    }
    @GetMapping
    public String isLogined(HttpSession session){
        String userName="";
        userName=(String) session.getAttribute("userName");
        return userName;
    }
}

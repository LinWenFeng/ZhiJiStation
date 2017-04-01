package com.team.web.controller;

import com.team.domain.entity.User;
import com.team.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by BLACK on 2017/3/26.
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping
    public Boolean save(User user){
        User user1=new User();
        user1.setUsername(user.getUsername());
      Boolean saveResult= userRepository.exists(Example.of(user1));
      if(!saveResult) {
          userRepository.save(user);
      }
       return  !saveResult;
    }
}

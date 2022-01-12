package com.study.board.controller;

import com.study.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //@RequestMapping("/")
    //public String login(){
    //    return "login";
    //}
}

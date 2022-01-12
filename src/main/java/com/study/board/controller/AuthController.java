package com.study.board.controller;

import com.study.board.Service.AuthService;
import com.study.board.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AuthController {

    private final AuthService authService;

    @GetMapping("/signin")
    public String SigninForm() {
        return "signin";
    }

    @GetMapping("/signup")
    public String SignupForm() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(User user) {

        User newUser = user; // 새로운 유저를 받음

        User userEntity = authService.signup(user);
        System.out.println(userEntity);

        return "signin";
    }
}
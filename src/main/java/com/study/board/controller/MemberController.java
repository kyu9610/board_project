package com.study.board.controller;

import com.study.board.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    //@RequestMapping("/")
    //public String login(){
    //    return "login";
    //}
}

package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/") // LocalHost 에서 "/" 경로로 들어왔을경우
    @ResponseBody // return 을 그대로 띄워주는 것.
    public String main(){
        return "Hello World";
    }
}

package com.example.loginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("/testGet")
    @ResponseBody
    public String testGet() {
        return "testGet Successfully";
    }


    @PostMapping("/testPost")
    @ResponseBody
    public String testPost() {
        return "testPost Successfully";
    }

}

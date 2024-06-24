package com.example.loginsystem.controller;

import com.example.loginsystem.entity.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
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

    @PostMapping("/login")
    @ResponseBody
    public String login(User user, HttpSession session, HttpServletResponse response) {
        if ("黎志城".equals(user.getName()) && "123456".equals(user.getPassword())) {
            user.setTicket("1");
            session.setAttribute("user",user);
            response.addCookie(new Cookie("ticket",user.getTicket()));
            return "登录成功！";
        }
        return "登录失败！";
    }

}

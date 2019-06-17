package com.sixmai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("toLogin")
    public String toLogin() {
        return "test.jsp";
    }
}

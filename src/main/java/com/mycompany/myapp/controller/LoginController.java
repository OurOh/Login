package com.mycompany.myapp.controller;

import com.mycompany.myapp.model.User;
import com.mycompany.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.login(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "home";  // 로그인 성공 시 이동할 페이지
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // 로그인 실패 시 다시 로그인 페이지로
        }
    }
}

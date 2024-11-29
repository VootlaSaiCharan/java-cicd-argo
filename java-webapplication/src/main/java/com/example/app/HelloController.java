package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index.html";
//        return "Hello, Docker!";
    }
}
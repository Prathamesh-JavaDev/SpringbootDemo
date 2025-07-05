package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DemoController {

    @GetMapping("/home")
    public String sayHello(){
        return "Hello Prathamesh from springboot";
    }
}

package com.software.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController是@ResponseBody和@Controller的整合
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello Tang";
    }

    @RequestMapping("/hi")
    public String handle02(){
        return "Hi SpringBoot";
    }
}

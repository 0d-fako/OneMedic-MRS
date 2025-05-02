package com.onemedic.onemedic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @GetMapping("/add")
    public int add(@RequestParam int one, @RequestParam int two) {
        return one + two;
    }
}



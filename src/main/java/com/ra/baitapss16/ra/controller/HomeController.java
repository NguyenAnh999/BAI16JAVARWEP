package com.ra.baitapss16.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index (){
        return "index";
    }
    @RequestMapping("/about")
    public String about (){
        return "about";
    }
}

package com.ra.baitapss16.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller

public class Bai2Controller {

    @RequestMapping("/changetextafter")
    public String after(@RequestParam(name = "inputText") String inputText, Model model) {
        List<String> list = Arrays.asList("hello", "abc");
        if (list.stream().anyMatch(s -> s.equals(inputText))) {
            model.addAttribute("text",inputText);
            return "changetextafter";
        } else {
            return "changetextafterer";
        }
    }
    @RequestMapping("/changetexx")
    public String change(){
        return "changetexx";
    }
}

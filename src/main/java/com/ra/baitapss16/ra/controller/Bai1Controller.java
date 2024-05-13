package com.ra.baitapss16.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Bai1Controller {
    @RequestMapping("/changemoneyafter")
    public String after(@RequestParam(name = "inputMoney") double inputMoney, @RequestParam(name = "inputRate") double inputRate, Model model) {
        model.addAttribute("after", inputMoney / inputRate);
        return "changemoneyafter";
    }

    @RequestMapping("/changemoney")
    public String changeMoney(Model model) {

        return "changemoney";
    }


}

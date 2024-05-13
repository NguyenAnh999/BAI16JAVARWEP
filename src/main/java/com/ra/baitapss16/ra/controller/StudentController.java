package com.ra.baitapss16.ra.controller;

import com.ra.baitapss16.ra.model.entity.Student;
import com.ra.baitapss16.ra.model.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    IStudentService studentSv;
    @RequestMapping("/student")

    public String student (Model model){
        List<Student>  studentList = studentSv.getAll();
        model.addAttribute("listSTD",studentList);
        return "student";
    }

}

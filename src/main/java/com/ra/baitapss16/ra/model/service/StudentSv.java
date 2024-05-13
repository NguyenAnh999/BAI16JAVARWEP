package com.ra.baitapss16.ra.model.service;


import com.ra.baitapss16.ra.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentSv implements IStudentService{
    @Override
    public List<Student> getAll() {

        return Arrays.asList(new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"),new Student(1,"anhs",true,15,"asc@gmail.com"));
    }
}

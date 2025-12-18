package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity entity){
            return ser.postdata(stu);
    }
    @GetMapping("/Get")
    public List<StudentEntity> getval(){
        return service.getAllData
    }
}


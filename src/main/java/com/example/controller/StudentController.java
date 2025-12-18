package com.example.demo.controller;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }
    @GetMapping("/get")
    public List<StudentEntity> geAllData(){
        return ser.getData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteVal(@PathVariable int id){
        return ser.deleteData(id);
    }
    @GetMapping("/getData/{id}")
    public StudentEntity FindVal(@PathVariable int id){
        return ser.findData(id);
    }  
    @PutMapping("/put/{id}")
    public StudentEntity UpdateData(@PathVariable int id,@RequestBody StudentEntity stu){
            return ser.updateData(id,stu);
    }

}

package com.example.demo.controller;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import jakarta.validation.Valid;
@RestController
public class ValidationController{
    @Autowired ValidationService serve;
    @PostMapping("/data")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
        return serve.post(stu);
    }
}
package com.example.demo.controller;

import org.springframework.bens.factory.annotation.Autoeired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.service.StudentService;

@RestController
 public class StudentController {
    @Autowired StudentService ser;

 }
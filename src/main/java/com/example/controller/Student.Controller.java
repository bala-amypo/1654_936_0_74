package com.example.demo.controller;

import org.springframework.bens.factory.annotation.Autoeired;
import org.springframework.web.bind.annotation.ReatController;

import com.example.demo.service.StudentService
@RestController
 public class StudentController {
    @Autowired StudentService ser;

 }
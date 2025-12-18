package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ValidationServiceImpl implements ValidationService{
     @Autowired ValidationRepository student;
     
          @Override
          public ValidationEntity post(ValidationEntity stu){
               return student.save(stu);
          }
}
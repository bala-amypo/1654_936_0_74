package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
        
    @Autowired StudentRepository student;
    // save,findAll(),findById(),deleteId(),existsById()
    @Override
    public StudentEntity postdata(StudentEntity entity){
        return student.save(entity);
    }
    @Override
    public List<StudentEntity>getAllData(){
        return student.findAll();
    }

}

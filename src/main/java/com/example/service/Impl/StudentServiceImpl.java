package com.example.demo.service.Impl;
import org.springframework.stereotype.service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService  {
     @Autowired StudentRepository student;
     //save()
     //findAll()
     //findById()
     //deleteById();
     //existsById();
     @Override


     
    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }

}
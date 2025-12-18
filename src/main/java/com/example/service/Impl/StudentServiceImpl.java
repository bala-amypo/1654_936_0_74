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
    @Override
    public String DeleteData(int id){
            student.deleteById(id);
            return "Delete Successfully";
    
    }
@Override
public StudentEntity getData(int id){
    return student.fundById(id).orElse(null);
}
@Override
public StudentEntity updateDate(int id,StudentEntity entity){
    if(student.existingBy(id)){
        entity.setId(id);
        return student.save(entity);
    }          
    return null;
}
}
               
package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.List;
public interface StudentService{
        StudentEntity postdata(StudentEntity entity);
        List<StudentEntity>getAllData();
        String DeleteData(int id);
        StudentEntity getData(int id);
        StudentEntity updateData(int id,StudentEntity entity);
}

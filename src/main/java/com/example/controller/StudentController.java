package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Studententity;
import com.example.demo.service.StudentService;
import java.util.List;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public Studententity sendData(@RequestBody Studententity entity){
            return ser.postdata(entity);
    }
    @GetMapping("/Get")
    public List<Studententity>getval(){
        return ser.getAllData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteval(@PathVariable int id){
        return ser.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public Studententity getData(int id){
    return ser.getData(id);
   }
   @PutMapping("/put/{id}")
   public Studententity putval(@PathVariable int id,@RequestBody Studententity entity){
    return ser.updateData(id,entity);
   }
}


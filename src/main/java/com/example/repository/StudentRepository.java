package com.example.demo.repository;

import org.springframework.sterotype.Repository;

import org.springframework.stereotype.Repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
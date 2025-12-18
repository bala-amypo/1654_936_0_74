package com.example.demo.repository;
import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ValidationRepo extends JpaRepository<ValidationEntity,Long>{

}

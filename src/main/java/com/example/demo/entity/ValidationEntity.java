package com.example.demo.entity

import jakarta.persistance.Entity;
import jakart.persistance.GeneratedValue;
import jakart.persistance.GenerationType;
import jakart.persistanceId;
import jakart.persistance.constrains.NotNull;
import jakart.persistance.constrains.Size;

@Entity
public class ValidiationEntity{
@Id
@GeneratedValue(stragy = GenerationType.IDENTY)
private Long id;
@Not Null
@Size(min = 2, max = , message = "must br 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    
    private String password;
    private int age;

}
package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Max;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email
    private String email;
    @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)@Positive(message="Age must be a Positive number")
    private Integer age;


    public ValidationEntity(Long id,@NotNull@Size(min=2,max=10,message="must be 2 to 10 characters")String username,@Email
    String email,
    @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    String password,
    @Max(30)
    @Positive(message="Age must be a Positive number")
    Integer age){
        this.id=id;
        this.username=username;
        this.age=age;
        this.email=email;
        this.password=password; 
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setId(Long id){
        this.id=id;
    }
    
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Long getId(){
        return id;
    }
    public ValidationEntity(){}
}

package com.example.demo.entity;

import jakarta.validation.constraints.NotNull;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 30,message = "must be 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @Size(min = 2,max = 30,message = "must be 2 to 10 character")
    @NotNull(message = "Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message = "Age must be a positive number")
    private Int age;
    
 //Name
    public String getName(){
        return username;
    }
    public void setName(String username){
        this.username=username;
    }

    //Id -primary key
    public Long getID(){
        return id;
    }
    public void setID(Long id){
        this.id=id;
    }

    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    // Password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    // Created
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age=age;
    }
    public ValidationEntity(Long id,
    @NotNull @Size(min = 2,max = 30,message = "must be 2 to 10 character") String username,
    @Email(message = "Email is not valid") String email,
    @Size(min = 2,max = 30,message = "must be 2 to 10 character") @NotNull(message = "Password is mandatory") String password,
    @Max(30) @Positive(message = "Age must be a positive number") int age){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.age=age;
    }

}

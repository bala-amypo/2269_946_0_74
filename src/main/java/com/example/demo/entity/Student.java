package com.example.demo.entity;


import jakarta.persistence.*;
@entity

public class Student{
    @id
    @GenerateValue(Strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private Float cgpa;
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public Float getcgpa(){
        return cgpa;
    }
    public void setcgpa(Float cgpa){
        this.cgpa=cgpa;
    }
    public Student(int id, String stname, String stemail, float cgpa) {
        this.id = id;
        this.stname = stname;
        this.stemail = stemail;
        this.cgpa = cgpa;
    }
    public Student() {
    }

}
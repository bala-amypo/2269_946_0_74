package com.example.demo.entity;

import java.util.*;
import jakarta.persistence.*;

@Entity
public class Student{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;
    private String name;
    private String email;
    private float cgpa;

    public int getId(){
        return id;
    }
    public void setId(int id){
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
    public float getcgpa(){
        return cgpa;
    }
    public void setcgpa(Float cgpa){
        this.cgpa=cgpa;
    }
    public Student(String name, String email, float cgpa) {
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }
    public Student() {
    }

}
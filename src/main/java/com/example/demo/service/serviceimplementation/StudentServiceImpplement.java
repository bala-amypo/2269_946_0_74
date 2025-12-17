
package com.example.demo.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    StudentRepository repo;


    @Override
    // Create (or Insert) data
    public Student createData(Student stu) {
        return repo.save(stu);
    }

    @Override
    // Fetch all records
    public List<Student> fetchRecord() {
        return repo.findAll();
    }
}
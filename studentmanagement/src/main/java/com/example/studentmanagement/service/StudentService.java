package com.example.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;

@Service
public class StudentService 
{
@Autowired
private StudentRepository repo;
public List<Student> listAll()
{
System.out.println(repo.findAll());
    return repo.findAll();
}


public void save(Student std) {
    repo.save(std);
}

public Student get(long id) {
    return repo.findById(id).get();
}

public void delete(long id) {
    repo.deleteById(id);
}

}
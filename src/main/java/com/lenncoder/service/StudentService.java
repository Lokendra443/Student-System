package com.lenncoder.service;

import com.lenncoder.entity.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}

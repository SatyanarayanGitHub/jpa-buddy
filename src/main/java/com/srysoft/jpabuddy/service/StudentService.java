package com.srysoft.jpabuddy.service;

import com.srysoft.jpabuddy.entity.Student;
import com.srysoft.jpabuddy.exception.RecordNotFoundException;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student getStudentById(Long studentId) throws RecordNotFoundException;

    public Student createStudent(Student student);

    public Student updateStudent(Long id, Student student);
}

package com.srysoft.jpabuddy.service;

import com.srysoft.jpabuddy.dto.StudentDto;
import com.srysoft.jpabuddy.entity.Student;
import com.srysoft.jpabuddy.exception.RecordNotFoundException;

import java.util.List;

public interface StudentService {

    public List<StudentDto> getAllStudents();

    public Student getStudentById(Long studentId) throws RecordNotFoundException;

    public StudentDto createStudent(StudentDto studentDto);

    public Student updateStudent(Long id, Student student);
}

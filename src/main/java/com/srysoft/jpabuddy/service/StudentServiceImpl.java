package com.srysoft.jpabuddy.service;

import com.srysoft.jpabuddy.dao.StudentRepository;
import com.srysoft.jpabuddy.entity.Student;
import com.srysoft.jpabuddy.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {

        List<Student> studentList = studentRepository.findAll();

        if (studentList.size() > 0) {
            return studentList;
        } else {
            return new ArrayList<Student>();
        }
    }

    @Override
    public Student getStudentById(Long studentId) throws RecordNotFoundException {

        final Optional<Student> student = studentRepository.findById(studentId);

        if (student.isPresent())
            return student.get();
        else
            throw new RecordNotFoundException("No Student found for given Id [" + studentId + "]");
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

}

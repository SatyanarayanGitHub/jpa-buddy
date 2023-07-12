package com.srysoft.jpabuddy.service;

import com.srysoft.jpabuddy.dao.StudentRepository;
import com.srysoft.jpabuddy.dto.StudentDto;
import com.srysoft.jpabuddy.entity.Student;
import com.srysoft.jpabuddy.exception.RecordNotFoundException;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {

        List<Student> studentList = studentRepository.findAll();

        if (studentList.size() > 0) {
            //return studentList;
            return studentList
                    .stream()
                    .map((student) -> modelMapper.map(student, StudentDto.class))
                    .collect(Collectors.toList());
        } else {
            return new ArrayList<StudentDto>();
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
    public StudentDto createStudent(StudentDto studentDto) {

        logger.info("-->> Create Student");

        //convert DTO to Entity
        Student student = modelMapper.map(studentDto, Student.class);
        logger.info(student.toString());
        studentRepository.save(student);

        logger.info("Entity to DTO : " + student.toString());
        //convert Entity to DTO
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

}

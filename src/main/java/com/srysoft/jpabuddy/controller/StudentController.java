package com.srysoft.jpabuddy.controller;

import com.srysoft.jpabuddy.dto.StudentDto;
import com.srysoft.jpabuddy.service.StudentService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    public StudentController() {
        logger.info("-->> Student Controller created!!");
    }

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> allStudents = studentService.getAllStudents();
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        logger.info("-->> Create Student - " + studentDto);
        StudentDto studentDtoObject = studentService.createStudent(studentDto);

        logger.info("-->> Created -- "+ studentDtoObject);
        return new ResponseEntity<>(studentDtoObject, HttpStatus.CREATED);
    }


}

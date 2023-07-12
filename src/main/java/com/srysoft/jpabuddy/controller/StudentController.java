package com.srysoft.jpabuddy.controller;

import com.srysoft.jpabuddy.dto.StudentDto;
import com.srysoft.jpabuddy.service.StudentService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/students")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents()
                .stream()
                .map((student) -> modelMapper.map(student, StudentDto.class))
                .collect(Collectors.toList());
    }


}

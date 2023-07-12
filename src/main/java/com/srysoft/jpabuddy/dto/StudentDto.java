package com.srysoft.jpabuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class StudentDto {
    private Long studentId;

    private String firstName;

    private String lastName;

    private String emailId;

    private GuardianDto guardian;


}

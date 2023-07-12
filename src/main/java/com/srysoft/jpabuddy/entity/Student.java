package com.srysoft.jpabuddy.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_student", uniqueConstraints = {
        @UniqueConstraint(name = "uc_student_email_id", columnNames = {"email_id"})
})
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "student_sequence")

    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id",nullable = false)
    private String emailId;

    @Column(name = "guardian_name")
    private String guardianName;

    @Column(name = "guardian_email")
    private String guardianEmail;

    @Column(name = "guardian_mobile")
    private String guardianMobile;

}
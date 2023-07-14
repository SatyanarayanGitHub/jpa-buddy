package com.srysoft.jpabuddy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_course_material")
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_material_id")
    private Long courseMaterialId;
    private String url;

    @OneToOne
    @JoinColumn(
            name = "course_course_id",
            referencedColumnName = "course_id"
    )
    private Course course;
}

package com.srysoft.jpabuddy.dao;

import com.srysoft.jpabuddy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
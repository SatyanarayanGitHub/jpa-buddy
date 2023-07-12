package com.srysoft.jpabuddy.dao;

import com.srysoft.jpabuddy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
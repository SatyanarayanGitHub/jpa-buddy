package com.srysoft.jpabuddy.dao;

import com.srysoft.jpabuddy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
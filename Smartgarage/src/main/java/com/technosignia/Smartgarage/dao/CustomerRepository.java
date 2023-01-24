package com.technosignia.Smartgarage.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.Smartgarage.CustomerEntity.Customer;

import jakarta.persistence.Entity;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	

}

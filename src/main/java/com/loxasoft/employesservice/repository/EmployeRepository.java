package com.loxasoft.employesservice.repository;

import com.loxasoft.employesservice.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
}

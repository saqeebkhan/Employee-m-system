package com.test.Employeemsystem.repository;

import com.test.Employeemsystem.data.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emprepository extends JpaRepository<Employee,Long> {
}

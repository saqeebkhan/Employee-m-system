package com.test.Employeemsystem.controller;


import com.test.Employeemsystem.data.Employee;
import com.test.Employeemsystem.repository.Emprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/employee")
public class Empcontroller {
    @Autowired
    private Emprepository emprepository;


    @GetMapping
    public List<Employee> getAllEmployees(){
        return emprepository.findAll();
    }

    @PostMapping
    public String saveEmployee(Employee employee){
        emprepository.save(employee);
        return "Employee Save Sucessfully";
    }

    @GetMapping("/{id}")
    public String getEmployeeById(Long id){
        Employee employee = emprepository.getById(id);
        if (employee==null){
            throw new RuntimeException("Employee Not Found");
        }
        return "employee by id";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(Long id){
        Employee employee = emprepository.getById(id);
        if (employee==null){
            throw  new RuntimeException("Employee Not Found");
        }
        emprepository.deleteById(id);
        return "Deleted: " + employee.getFirstname()+ " " + employee.getLastname();
    }

}

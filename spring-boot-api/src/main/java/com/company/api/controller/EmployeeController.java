package com.company.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.api.dto.EmployeeDto;
import com.company.api.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
     private EmployeeService employeeService;

     @GetMapping("/list")
     public ResponseEntity<List<EmployeeDto>> findAllEmployees() {
        return new ResponseEntity<>(employeeService.findEmployee(), HttpStatus.OK);
     }

     @PostMapping
     public ResponseEntity<List<EmployeeDto>> createNewEmployee(@RequestBody EmployeeDto employee) {
        try {
            employeeService.insertEmployee(employee);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }
}

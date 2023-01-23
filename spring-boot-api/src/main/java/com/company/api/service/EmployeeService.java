package com.company.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.api.dto.EmployeeDto;
import com.company.api.model.Employee;
import com.company.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void insertEmployee(EmployeeDto employee) {
        
        Employee newEmployee = new Employee();

        newEmployee.setName(employee.getName());
        newEmployee.setAge(employee.getAge());
        newEmployee.setCpf(employee.getCpf());
        newEmployee.setPosition(employee.getPosition());
        newEmployee.setPhoneNumber(employee.getPhoneNumber());
        newEmployee.setSector(employee.getSector());
        newEmployee.setSalary(employee.getSalary());

        employeeRepository.save(newEmployee);
    }

    public List<EmployeeDto> findEmployee() {
        List<EmployeeDto> listEmployee = new ArrayList<>();

        employeeRepository.findAll().forEach(item-> {
                EmployeeDto employee = EmployeeDto
                .builder()
                .name(item.getName())
                .position(item.getPosition())
                .sector(item.getSector())
                .phoneNumber(item.getPhoneNumber())
                .age(item.getAge())
                .salary(item.getSalary())
                .build();
                
            listEmployee.add(employee);
        });

        return listEmployee;
    }
}

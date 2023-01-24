package com.company.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue                                 
    private Long id;

    private String name;

    private Integer age;

    private String cpf;

    private String phoneNumber;

    private String position;

    private String sector;
    
    private String salary;
}

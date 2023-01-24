package org.acme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

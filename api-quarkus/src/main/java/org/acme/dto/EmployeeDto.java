package org.acme.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private String name;

    private Integer age;

    private String cpf;

    private String phoneNumber;

    private String position;

    private String sector;
    
    private String salary;
}

package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Employee;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {
}

package org.acme.controller;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.acme.dto.EmployeeDto;
import org.acme.service.EmployeeService;



@Path("/api/employee")
public class EmployeeController {

    @Inject
     private EmployeeService employeeService;

     @GET
     @Path("/list")
     public Response listEmployee() {
        // return Response.ok(employeeService.findEmployee()).build();
        System.out.println(Response.ok(employeeService.findEmployee()));
        return Response.ok(employeeService.findEmployee()).build();
     }

     @POST
     @Transactional
     public Response createNewEmployee(EmployeeDto employee) {
        try {
            employeeService.insertEmployee(employee);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
     }
}

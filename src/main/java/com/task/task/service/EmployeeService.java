package com.task.task.service;

import com.task.task.dto.request.EmployeeReqDto;
import com.task.task.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

    List <Employee>  getEmployee();


    ResponseEntity<?> saveEmployee(EmployeeReqDto employeeReqDto);




}

package com.task.task.controller;

import com.task.task.dto.request.EmployeeReqDto;
import com.task.task.entity.Employee;
import com.task.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmp")
    List<Employee> getAllEmployee(){
        return employeeService.getEmployee();
    }

    @PostMapping("/saveEmp")
    public ResponseEntity<?> saveEmp(@RequestBody EmployeeReqDto employeeReqDto){
        return employeeService.saveEmployee(employeeReqDto);
  }


}

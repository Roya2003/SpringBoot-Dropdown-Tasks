package com.task.task.repository;

import com.task.task.entity.Employee;
import com.task.task.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeePKId> {


}

package com.task.task.repository;

import com.task.task.entity.EmployeeEmbeddedEntity;
import com.task.task.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDepMappingRepo extends JpaRepository<EmployeeEmbeddedEntity, EmployeePKId> {
}

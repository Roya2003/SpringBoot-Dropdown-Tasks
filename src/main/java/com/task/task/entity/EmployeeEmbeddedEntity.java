package com.task.task.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee_department_mapping")
@Getter
@Setter
public class EmployeeEmbeddedEntity {

    @EmbeddedId
    private EmployeePKId employeePKId;
}

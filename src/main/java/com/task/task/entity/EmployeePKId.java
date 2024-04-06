package com.task.task.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@Data
@EqualsAndHashCode
public class EmployeePKId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employeeId;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department depertmentId;
}

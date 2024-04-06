package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="visit_mark_table")
public class HeadingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="emailid")
    private String emailid;

    @Column(name="registrationdate")
    private LocalDate registrationdate;

    @Column(name="firstname")
    @NotNull(message = "First name cannot be null")
    private String firstname;

    @Column(name="middlename")
    private String middlename;

    @Column(name="lastname")
    @NotNull(message = "Last Name cannot be null")
    private String lastname;

    @Column(name="dateofbirth")
    private LocalDate dateofbirth;

    @Column(name="age")
    private Integer age;

    @Column(name="years")
    private Long years;

    @Column(name="months")
    private Integer months;

    @Column(name="days")
    private Long days;

    @Column(name="phoneno")
    @NotNull(message = "Phone No cannot be null")
    private Long phoneno;

    @Column(name="houseno")
    private String houseno;

    @Column(name="streetAddress")
    private String streetAddress;



}
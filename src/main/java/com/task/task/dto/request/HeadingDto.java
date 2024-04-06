package com.task.task.dto.request;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class HeadingDto {

    private Long id;

    @Email
    private String emailid;

    private LocalDate registrationdate;

    @NotNull
    private String firstname;

    @NotNull
    private String middlename;

    private String lastname;

    private LocalDate dateofbirth;

    private Integer age;

    private Long years;

    private Integer months;

    private Long days;

    @NotNull
    private Long phoneno;

    private String houseno;


    private String streetAddress;



}

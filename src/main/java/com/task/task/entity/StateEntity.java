package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="mt_State")


public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description",unique = true)
    @NotNull(message = "State name cannot be null")
    private String description;


    @ManyToOne
    @JoinColumn(name = "country_id")
    private  CountryEntity country;
}

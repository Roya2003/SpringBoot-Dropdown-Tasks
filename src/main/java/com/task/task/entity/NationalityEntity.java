package com.task.task.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@Entity
@Table(name="mt_nationality")
public class NationalityEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="description",unique = true)
    @NotNull(message = "Nationality cannot be null")
    private String description;

}

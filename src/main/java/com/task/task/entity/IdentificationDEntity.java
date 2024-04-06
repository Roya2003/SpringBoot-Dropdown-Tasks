package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "mt_Identification_Document")
public class IdentificationDEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description",unique = true)
    @NotNull(message = "Identification Document cannot be null")
    private String description;
}

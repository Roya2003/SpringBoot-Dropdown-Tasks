package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "mt_prefix")
public class PrefixEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description" ,unique = true)
    @NotNull(message = "Prefix cannot be null")
    private String description;

}

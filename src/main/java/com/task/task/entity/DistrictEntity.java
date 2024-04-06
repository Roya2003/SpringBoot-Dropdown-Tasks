package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="mt_District")
public class DistrictEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description",unique = true)
    @NotNull(message = "District Name cannot be null")
    private String description;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private StateEntity state;
}

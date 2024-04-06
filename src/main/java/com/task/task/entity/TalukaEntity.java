package com.task.task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="mt_Taluka")
public class TalukaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description",unique = true)
    @NotNull(message = "Taluka Name cannot be null")
    private String description;

    @ManyToOne
    @JoinColumn(name = "District_id")
    private DistrictEntity district;


}

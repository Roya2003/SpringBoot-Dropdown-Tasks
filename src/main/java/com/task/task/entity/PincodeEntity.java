package com.task.task.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "mt_pincode")

public class PincodeEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "description",unique = true)
    @NotNull(message = "Pincode cannot be null")
    private Long description;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

}

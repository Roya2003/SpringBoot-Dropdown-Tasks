package com.task.task.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="mt_City")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "Taluka_id")
    private TalukaEntity taluka;
}

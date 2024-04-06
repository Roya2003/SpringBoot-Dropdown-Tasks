package com.task.task.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Areas_table")
public class AreasDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

}

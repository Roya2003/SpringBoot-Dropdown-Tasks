package com.task.task.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mt_Isd")
public class ISDEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description",unique = true)
    private Long description;


}


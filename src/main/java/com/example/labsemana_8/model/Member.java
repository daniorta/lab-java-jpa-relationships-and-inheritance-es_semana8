package com.example.labsemana_8.model;

import com.example.labsemana_8.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate renewalDate;

    @ManyToOne//un miembro puede pertenecer a varias divisiones
    @JoinColumn(name="division_id")
    private Division division;

}

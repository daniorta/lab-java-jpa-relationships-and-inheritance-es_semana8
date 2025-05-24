package com.example.labsemana_8.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer presentationDuration;

    //Mapeamos el onetomany de speaker
    @ManyToMany(mappedBy = "speakers", fetch = FetchType.LAZY)
    private List<Conference> conferences;

}



package com.example.labsemana_8.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String district;

    private String presidente;

    @ManyToOne(fetch = FetchType.LAZY )//Muchas divisiones puiede pertenercer a 1 asociacion
    @JoinColumn(name="association_id")
    private Association association;

    @OneToMany(mappedBy = "division",fetch = FetchType.EAGER) //Una division puede tener varios miembros
    private List<Member> members;
}

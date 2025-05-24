//package com.example.labsemana_8.utility;
//
//import com.example.labsemana_8.enums.Status;
//import com.example.labsemana_8.model.Association;
//import com.example.labsemana_8.model.Division;
//import com.example.labsemana_8.model.Member;
//import com.example.labsemana_8.repository.AssociationRepository;
//import com.example.labsemana_8.repository.DivisionRepository;
//import com.example.labsemana_8.repository.MemberRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//
//import java.time.LocalDate;
//import java.util.List;
//
//
//@Component
//public class DataInitializer implements CommandLineRunner {
//
//    private final AssociationRepository associationRepository;
//    private final DivisionRepository divisionRepository;
//    private final MemberRepository memberRepository;
//
//    public DataInitializer(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository){
//        this.associationRepository = associationRepository;
//        this.divisionRepository = divisionRepository;
//        this.memberRepository = memberRepository;
//    }
//
//    @Override
//    public void run(String...args)throws Exception{
//
//        //Creando la asociacion
//        Association association = new Association();
//        association.setName("Asociación de Enfermería de España");
//        associationRepository.save(association);
//
//        //-----Divisiones
//        //Creando las 7 divisiones.
//        Division division1 = new Division();
//        division1.setName("Obstétrico-Ginecológica (Matrona)");
//        division1.setDistrict("Madrid");
//        division1.setPresidente("Dra. Carmen López\n");
//        division1.setAssociation(association);
//
//        Division division2 = new Division();
//        division2.setName("Salud Mental");
//        division2.setDistrict("Barcelona");
//        division2.setPresidente("Dr. Antonio Ruiz");
//        division2.setAssociation(association);
//
//
//        Division division3 = new Division();
//        division3.setName("Enfermería del Trabajo");
//        division3.setDistrict("Valencia");
//        division3.setPresidente("Dra. Pilar Fernández");
//        division3.setAssociation(association);
//
//
//        Division division4 = new Division();
//        division4.setName("Enfermería Geriátrica");
//        division4.setDistrict("Sevilla");
//        division4.setPresidente("Dr. José Antonio Gómez");
//        division4.setAssociation(association);
//
//        Division division5 = new Division();
//        division5.setName("Enfermería Familiar");
//        division5.setDistrict("Bilbao");
//        division5.setPresidente("Dra. Isabel Martínez");
//        division5.setAssociation(association);
//
//
//        Division division6 = new Division();
//        division6.setName("Enfermería Médico-Quirúrgica");
//        division6.setDistrict("Zaragoza");
//        division6.setPresidente("Dr. Luis Hernández");
//        division6.setAssociation(association);
//
//
//        Division division7 = new Division();
//        division7.setName("Enfermería Pediátrica");
//        division7.setDistrict("Málaga");
//        division7.setPresidente("Dra. Elena García");
//        division7.setAssociation(association);
//        divisionRepository.saveAll(List.of(division1, division2, division3, division4, division5, division6, division7));
//
//        //Creando los miembros de cada division
//        Member newMember = new Member();
//        newMember.setName("Juan");
//        newMember.setStatus(Status.ACTIVE);
//        newMember.setRenewalDate(LocalDate.now());
//        newMember.setDivision(division1);
//
//        Member newMember1 = new Member();
//        newMember1.setName("Jenifer");
//        newMember1.setStatus(Status.LAPSED);
//        newMember1.setRenewalDate(LocalDate.now());
//        newMember1.setDivision(division2);
//
//        Member newMember2 = new Member();
//        newMember2.setName("Leonardo");
//        newMember2.setStatus(Status.ACTIVE);
//        newMember2.setRenewalDate(LocalDate.now());
//        newMember2.setDivision(division3);
//
//        Member newMember3 = new Member();
//        newMember3.setName("Inma");
//        newMember3.setStatus(Status.ACTIVE);
//        newMember3.setRenewalDate(LocalDate.now());
//        newMember3.setDivision(division4);
//
//        Member newMember4 = new Member();
//        newMember4.setName("Azucena");
//        newMember4.setStatus(Status.ACTIVE);
//        newMember4.setRenewalDate(LocalDate.now());
//        newMember4.setDivision(division5);
//
//        Member newMember5 = new Member();
//        newMember5.setName("Jaime");
//        newMember5.setStatus(Status.ACTIVE);
//        newMember5.setRenewalDate(LocalDate.now());
//        newMember5.setDivision(division7);
//
//        Member newMember6 = new Member();
//        newMember6.setName("Maria del Carmen");
//        newMember6.setStatus(Status.ACTIVE);
//        newMember6.setRenewalDate(LocalDate.now());
//        newMember6.setDivision(division6);
//
//        memberRepository.saveAll(List.of(newMember, newMember1, newMember2, newMember3, newMember4, newMember5, newMember6));
//
//
//
//
//
//    }
//}

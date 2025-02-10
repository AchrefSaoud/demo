package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Departement implements Serializable {
    @Id
    @GeneratedValue
    private Integer idDepatement;

    private String nomDepartement;

    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;
}

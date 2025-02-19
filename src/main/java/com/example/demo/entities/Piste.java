package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piste {
    @Id
    @GeneratedValue
    private Long numPiste;

    private String namePiste;

    private Color color;

    private Integer length;

    private Integer slope;

    @ManyToMany
    private List<Skier> skiers;
}

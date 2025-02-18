package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
}

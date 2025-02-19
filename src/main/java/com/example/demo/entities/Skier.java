package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skier {
    
    @Id
    @GeneratedValue
    private Long numSkier;

    private String firstName;

    private String lastName;

    private Date dateBirth;

    private String city;

    @OneToMany(mappedBy = "skier")
    private List<Registration> registrations;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;


    @ManyToMany
    private List<Piste> pistes;
}
package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    
    @Id
    @GeneratedValue
    private Long numSubscription;

    private Date startDate;

    private Date endDate;

    private float price;

    private TypeSubscription typeSubscription;

    @OneToOne(mappedBy = "subscription")
    private Skier skier;
}
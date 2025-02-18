package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    private Long numCourse;

    private Integer level;

    private TypeCourse typeCourse;

    private Support support;

    private float price;

    private Integer timeSlot;

    @ManyToOne
    private Instructor instructor;

    @OneToMany(mappedBy = "course")
    private List<Registration> registrations;
}

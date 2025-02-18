package com.example.demo.entities;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue
    private Long numInstructor;

    private String firstname;

    private String lastname;

    private Date dateOfhire;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}

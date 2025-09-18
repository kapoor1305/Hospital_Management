package com.example.project.Hospital_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private LocalDate DOB;
    private int age;
    private String Gender;
    private String email;
}

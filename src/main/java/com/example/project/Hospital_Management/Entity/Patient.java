package com.example.project.Hospital_Management.Entity;

import com.example.project.Hospital_Management.Entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "Unique_patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "Unique_patient_name_DOB", columnNames = {"name", "DOB"})
        },
        indexes = {
                @Index(name = "idx_patient_DOB", columnList = "DOB")
        }

)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =40)
    private String name;

    @ToString.Exclude
    private LocalDate DOB;

    private String Gender;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
}

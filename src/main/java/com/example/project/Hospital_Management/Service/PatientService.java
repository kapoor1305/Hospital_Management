package com.example.project.Hospital_Management.Service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.example.project.Hospital_Management.Entity.Patient;
import com.example.project.Hospital_Management.Repository.PatientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient getPatientById(Long id) {

        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();

        p1.setName("shubham");

        return p1;
    }
}

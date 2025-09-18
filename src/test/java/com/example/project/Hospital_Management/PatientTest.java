package com.example.project.Hospital_Management;

import com.example.project.Hospital_Management.Entity.Patient;
import com.example.project.Hospital_Management.Repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {
    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

    }
}

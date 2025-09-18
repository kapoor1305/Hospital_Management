package com.example.project.Hospital_Management;

import com.example.project.Hospital_Management.Entity.Patient;
import com.example.project.Hospital_Management.Repository.PatientRepository;
import com.example.project.Hospital_Management.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;

    @Test
    public void testPatient() {
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);

    }
    @Test
    public void testGetPatientById() {
        Patient patient = patientService.getPatientById(1L);
        System.out.println(patient);
    }
}

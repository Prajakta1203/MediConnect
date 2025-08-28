package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.PatientDAO;
import com.wecp.progressive.entity.Patient;

public class PatientServiceImplArraylist implements PatientDAO  {

    @Override
    public int addPatient(Patient patient) {
        return -1;
    }

    @Override
    public Patient getPatientById(int patientId) {
        return null;
    }

    @Override
    public void updatePatient(Patient patient) {
        
    }

    @Override
    public void deletePatient(int patientId) {
        
    }

    @Override
    public List<Patient> getAllPatients() {
       List<Patient> patients = new ArrayList<>();
       return patients;
    }

}
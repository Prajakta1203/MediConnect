package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.DoctorDAO;
import com.wecp.progressive.entity.Doctor;

public class DoctorServiceImplJdbc implements DoctorDAO  {

    @Override
    public int addDoctor(Doctor doctor) {
        return -1;
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        return null;
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        
    }

    @Override
    public void deleteDoctor(int doctorId) {
        
    }

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        return doctors;
    }

}
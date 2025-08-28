package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.ClinicDAO;
import com.wecp.progressive.entity.Clinic;

public class ClinicServiceImplJdbc implements ClinicDAO  {

    @Override
    public int addClinic(Clinic clinic) {
        return -1;
    }

    @Override
    public Clinic getClinicById(int clinicId) {
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) {
        
    }

    @Override
    public void deleteClinic(int clinicId) {
        
    }

    @Override
    public List<Clinic> getAllClinics() {
        List<Clinic> clinics = new ArrayList<>();
        return clinics;
    }

}
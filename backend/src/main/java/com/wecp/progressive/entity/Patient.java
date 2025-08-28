package com.wecp.progressive.entity;

import java.sql.Date;

public class Patient {
    private int patient_id;
    private String full_name;
    private Date date_of_birth;
    private String contact_number;
    private String email;
    private String address;

    public Patient() {
    }

    public Patient(int patient_id, String full_name, Date date_of_birth, String contact_number, String email,
            String address) {
        this.patient_id = patient_id;
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.contact_number = contact_number;
        this.email = email;
        this.address = address;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
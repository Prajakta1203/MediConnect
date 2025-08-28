package com.wecp.progressive.entity;

public class Doctor {
    private int doctor_id;
    private String full_name;
    private String specialty;
    private String contact_number;
    private String email;
    private int years_of_experience;

    public Doctor() {
    }

    public Doctor(int doctor_id, String full_name, String specialty, String contact_number, String email,
            int years_of_experience) {
        this.doctor_id = doctor_id;
        this.full_name = full_name;
        this.specialty = specialty;
        this.contact_number = contact_number;
        this.email = email;
        this.years_of_experience = years_of_experience;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

}
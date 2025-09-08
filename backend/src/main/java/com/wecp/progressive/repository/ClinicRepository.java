package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Clinic;
import java.util.List;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic,Integer> {
    List<Clinic> findByLocation(String location);
}

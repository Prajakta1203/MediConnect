package com.wecp.progressive.repository;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 09d5845a2d02937f4838cd7759524a30af89128a
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer>{
    List<Billing> findByPatient_PatientId(int patientId);

<<<<<<< HEAD
=======
=======

public interface BillingRepository {
>>>>>>> cb63b9a6671ea13c550cbf5ccb71f2f1428ee50d
>>>>>>> 09d5845a2d02937f4838cd7759524a30af89128a
}

package com.Abhi.hospitalManagement.repository;

import com.Abhi.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

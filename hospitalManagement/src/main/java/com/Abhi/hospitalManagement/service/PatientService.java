package com.Abhi.hospitalManagement.service;

import com.Abhi.hospitalManagement.entity.Patient;
import com.Abhi.hospitalManagement.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id){
     Patient p1=   patientRepository.findById(id).orElseThrow();

          p1.setName("yo");
        //  patientRepository.save(p1);
        return p1;
    }


}

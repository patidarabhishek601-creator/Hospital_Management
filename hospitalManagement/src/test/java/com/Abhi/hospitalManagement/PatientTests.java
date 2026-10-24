package com.Abhi.hospitalManagement;

import com.Abhi.hospitalManagement.entity.Patient;
import com.Abhi.hospitalManagement.repository.PatientRepository;
import com.Abhi.hospitalManagement.service.PatientService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository pateientRepository;

    @Autowired
    private PatientService patientService;
    @Test
    public void testPatientRepository(){

      List<Patient> patientList= pateientRepository.findAll();
        System.out.println(patientList);
        Patient p1=new Patient();
        pateientRepository.save(p1);

    }
    @Test
    @Transactional

    public void testTransactionMethods(){
     Patient patient=patientService.getPatientById(1L);
       System.out.println(patient);



    }
}

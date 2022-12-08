package com.example.Patient_App_Backend2.dao;

import com.example.Patient_App_Backend2.model.patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface patientDao extends CrudRepository<patient,Integer> {

    @Query(value = "SELECT `id`, `disease`, `doctor`, `name` FROM `patient_model` WHERE `name`=:name",nativeQuery = true)
    List<patient> deletePatients(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient_model` WHERE `id`=:id",nativeQuery = true)
    void deletePatients(@Param("id") Integer id);
}

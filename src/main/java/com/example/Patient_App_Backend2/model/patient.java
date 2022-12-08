package com.example.Patient_App_Backend2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientModel")
public class patient {
    @Id
    @GeneratedValue()
    private int id;
    private String name;
    private String disease;
    private String doctor;

    @Override
    public String toString() {
        return "patientModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor='" + doctor + '\'' +
                '}';
    }

    public patient() {
    }


    public patient(int id, String name, String disease, String doctor) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}

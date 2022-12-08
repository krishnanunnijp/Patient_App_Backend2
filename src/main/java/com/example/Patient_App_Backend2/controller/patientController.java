package com.example.Patient_App_Backend2.controller;

import com.example.Patient_App_Backend2.dao.patientDao;
import com.example.Patient_App_Backend2.model.patient;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class patientController {

    @Autowired
    private patientDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> add(@RequestBody patient p){
        HashMap<String, String> map= new HashMap<>();
        dao.save(p);
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<patient> view(){
        return (List<patient>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<patient> search(@RequestBody patient p){
        String patients= String.valueOf(p.getName());
        System.out.println(patients);
        return (List<patient>) dao.deletePatients(p.getName());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public  HashMap<String, String> delete(@RequestBody patient p) {
    HashMap<String, String> map = new HashMap<String, String>();
    String patients = String.valueOf(p.getId());
        System.out.println(patients);
        map.put("status","success");
        dao.deletePatients(p.getId());
        return map;
    }

}

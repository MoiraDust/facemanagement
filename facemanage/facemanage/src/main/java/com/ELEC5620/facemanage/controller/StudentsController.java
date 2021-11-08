package com.ELEC5620.facemanage.controller;

import com.ELEC5620.facemanage.entity.Students;
import com.ELEC5620.facemanage.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;

    //get all student
    @GetMapping("/getAllStudent")
    public List<Students> getAllStudent() {return studentsRepository.findAll();}
}

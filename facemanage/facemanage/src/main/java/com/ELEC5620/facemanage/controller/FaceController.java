package com.ELEC5620.facemanage.controller;

import com.ELEC5620.facemanage.entity.Image;
import com.ELEC5620.facemanage.entity.Result;
import com.ELEC5620.facemanage.service.imp.FaceRegister;
import com.ELEC5620.facemanage.service.imp.FaceSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/face")
public class FaceController {
    @Autowired
    FaceSearch faceSearch;
    @Autowired
    FaceRegister faceRegister;

    @PostMapping("/register")
    public Result register(Image image){
        return faceRegister.register(image);
    }
}

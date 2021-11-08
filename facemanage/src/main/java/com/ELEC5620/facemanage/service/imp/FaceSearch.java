package com.ELEC5620.facemanage.service.imp;

import com.ELEC5620.facemanage.entity.Image;
import com.ELEC5620.facemanage.entity.Result;
import org.springframework.stereotype.Service;

@Service
public interface FaceSearch {
    Result faceLogin(Image image);
}

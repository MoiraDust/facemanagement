package com.ELEC5620.facemanage.entity;

import lombok.Data;

@Data
public class Result {
    private boolean start;
    private String userId;
    private String msg;
    private int faceNum;
    private String errorMsg;
}

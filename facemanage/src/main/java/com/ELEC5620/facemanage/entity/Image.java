package com.ELEC5620.facemanage.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imgId;

    @Column(name = "img_Str")
    private String img_Str;

    @Column(name = "img_type")
    private String img_type;

    @Column(name = "student_Id")
    private long student_Id; //和Students对应

    public Image(String img_Str, String img_type, long student_Id) {
        this.img_Str = img_Str;
        this.img_type = img_type;
        this.student_Id = student_Id;
    }

    public Image() {}

    public long getImgId() {
        return imgId;
    }

    public void setImgId(long imgId) {
        this.imgId = imgId;
    }

    public String getImg_Str() {
        return img_Str;
    }

    public void setImg_Str(String img_Str) {
        this.img_Str = img_Str;
    }

    public long getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(long student_Id) {
        this.student_Id = student_Id;
    }

    public String getImg_type() {
        return img_type;
    }

    public void setImg_type(String img_type) {
        this.img_type = img_type;
    }
}

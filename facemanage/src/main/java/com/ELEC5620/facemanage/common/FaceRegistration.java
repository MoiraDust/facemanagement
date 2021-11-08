package com.ELEC5620.facemanage.common;

import com.ELEC5620.facemanage.entity.Image;
import com.baidu.aip.face.AipFace;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Parser;
import java.util.HashMap;

@Component
public class FaceRegistration {

    public String Faceregistration(AipFace client, String groupList, Image image){
        HashMap<String, String> options = new HashMap<String, String>();
        long student_id = image.getStudent_Id();
        long image_id = image.getImgId();
        options.put("user_info", Long.toString(student_id));
        options.put("quality_control", "NORMAL");
        options.put("liveness_control", "NONE");
        JSONObject res = client.addUser(image.getImg_Str(), image.getImg_type(), groupList,Long.toString(image_id), options);
        return res.toString(2);
    }
}

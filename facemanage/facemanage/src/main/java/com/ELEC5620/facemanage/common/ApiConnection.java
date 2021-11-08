package com.ELEC5620.facemanage.common;

import com.baidu.aip.face.AipFace;
import org.springframework.stereotype.Component;

@Component
public class ApiConnection {

    public String APP_ID = "25124099";
    public String API_KEY = "UwaZ3Xj5HZQB3DNk1aeVfI5G";
    public String SECRET_KEY = "TIKz3KsqFLgfUu4RAOWBzjGZ0FB4GMqO";

    private final AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

    public AipFace getClient(){
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        return client;
    }
}

package com.ELEC5620.facemanage.common;

import com.ELEC5620.facemanage.entity.Image;
import com.baidu.aip.face.AipFace;
import com.baidu.aip.face.MatchRequest;
import org.json.JSONObject;

import java.util.ArrayList;

public class FaceCompare {

    public String Facecomparison(AipFace client, Image imageA, Image imageB){
        MatchRequest req1 = new MatchRequest(imageA.getImg_Str(), imageA.getImg_type());
        MatchRequest req2 = new MatchRequest(imageB.getImg_Str(), imageB.getImg_type());
        ArrayList<MatchRequest> requests = new ArrayList<MatchRequest>();
        requests.add(req1);
        requests.add(req2);
        JSONObject res = client.match(requests);
        return res.toString(2);
    }
}

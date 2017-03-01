package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetMaintenancePlan {

    public static String list(int cityId,int carId){
        String result="";
        String url="https://m.lechebang.com/gateway/plan/getCurrentMaintenancePlan";
        String json="{\"mileage\":5000,\"cityId\":%s,\"carId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"2b7b248c-2fcf-4141-b4e2-fdf0469344a6\"}";
        try {
            Response response= HTTP.post(url,String.format(json,cityId,carId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

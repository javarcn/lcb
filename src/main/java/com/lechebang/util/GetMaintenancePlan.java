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
        String json="{\"mileage\":5000,\"cityId\":%s,\"carId\":%s,\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"2b7b248c-2fcf-4141-b4e2-fdf0469344a6\"}";
        try {
            Response response= HTTP.post(url,String.format(json,cityId,carId).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetMaintenanceManual {

    public static String list(int carId,int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/plan/getMaintenanceManual";
        String json="{\"carId\":%s,\"cityId\":%s,\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"d61b854a-faa0-4245-9e50-7691304678d3\"}";
        try {
            Response response= HTTP.post(url,String.format(json,carId,cityId).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

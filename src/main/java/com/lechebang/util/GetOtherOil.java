package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetOtherOil {

    public static String list(int brandTypeId,int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/oilinfo/getOilInfoPriceResultOfBrandType";
        String json="{\"brandTypeId\":%d,\"cityId\":%d,\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"5981fe82-ff03-478e-b28e-6f82f6ae5f08\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandTypeId,cityId).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

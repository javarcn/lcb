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
        String json="{\"brandTypeId\":%d,\"cityId\":%d,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"5981fe82-ff03-478e-b28e-6f82f6ae5f08\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandTypeId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

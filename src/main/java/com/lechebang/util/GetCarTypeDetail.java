package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarTypeDetail {

    public static String list(int brandId){
        String result="";
        String url="https://m.lechebang.com/gateway/car/getCarTypeDetail";
        String json="{\"brandId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"a2083739-caa1-4bf3-b5f2-7ae29718e52a\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

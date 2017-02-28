package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SaveMyCar {

    public static String ok(int brandId,String brandName,String imgUrl,int secondId,int produceId,String carTypeName,int brandTypeId,String yearType,String name){
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/saveMyCar";
        String json="{\"brandId\":%s,\"brandName\":\"%s\",\"imgUrl\":\"%s\",\"secondId\":%s,\"produceId\":%s,\"carTypeName\":\"%s\",\"brandTypeId\":%s,\"yearType\":\"%s\",\"name\":\"%s\",\"buyDate\":1451577600000,\"mileage\":\"5000\",\"isCanUse\":1,\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"cfc4b1d7-78f2-438e-8d8f-af7c8a0bcdbf\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandId,brandName,imgUrl,secondId,produceId,carTypeName,brandTypeId,yearType,name).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarBrands {

    public static String list(int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/car/getFirstLevelBrandType";
        String json="{\"cityId\":%s,\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"39d71c97-2f00-4f8a-8e6a-3b3743fa6dd5\"}";
        try {
            Response response= HTTP.post(url,String.format(json,cityId).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

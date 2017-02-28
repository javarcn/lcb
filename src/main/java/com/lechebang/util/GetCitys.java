package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCitys {

    public static String list(){
        String result="";
        String url="https://m.lechebang.com/gateway/maintenance/getCitys";
        String json="{\"version\":\"2.2.0\",\"token\":\"597dc017ca11fd0d913ef24b21d3e4f9\",\"appCode\":100,\"lcb_client_id\":\"b4a044b6-a9ba-4d9f-9e60-4275cfaa8e59\",\"lcb_request_id\":\"9dc87c89-7e7d-43c8-9a98-8dd76a1b9414\"}";
        try {
            Response response= HTTP.post(url,json.getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

package com.lechebang.util;

import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class DelMyCar {

    public static String ok(int id){
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/delMyCar";
        String json="{\"id\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"d6774db2-5c59-4c05-9cf4-d524bc92c434\"}";
        try {
            Response response= HTTP.post(url,String.format(json,id,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

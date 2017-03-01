package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.City;
import com.lechebang.model.CityModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCitys {

    public static List<City> list(){
        List<City> cityList=new ArrayList<City>();
        String result="";
        String url="https://m.lechebang.com/gateway/maintenance/getCitys";
        String json="{\"version\":\"2.2.0\",\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"9dc87c89-7e7d-43c8-9a98-8dd76a1b9414\"}";
        try {
            Response response= HTTP.post(url,String.format(json,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            CityModel model=gson.fromJson(result,CityModel.class);
            if(model.getMsg().equals("ok")){
                cityList=model.getResult().getAll();
            }else {
                System.out.println("GetCitys方法:"+model.getMsg());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityList;
    }
}

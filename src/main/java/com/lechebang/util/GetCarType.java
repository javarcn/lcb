package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.*;
import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarType {

    public static List<CarTypeResult> list(int brandId, int cityId){
        List<CarTypeResult> list=new ArrayList<CarTypeResult>();
        String result="";
        String url="https://m.lechebang.com/gateway/car/getBrandProducerCar";
        String json="{\"brandId\":%s,\"cityId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"10da707e-8c79-4417-be49-459ddf6a3415\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            CarTypeModel model=gson.fromJson(result,CarTypeModel.class);
            if(model.getMsg().equals("ok")){
                list=model.getResult();
            }else {
                System.out.println("GetCarType方法:"+model.getMsg());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.Brand;
import com.lechebang.model.BrandModel;
import com.lechebang.model.BrandResult;
import com.lechebang.model.Model;
import com.m3.curly.HTTP;
import com.m3.curly.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarBrands {

    public static List<Brand> list(int cityId){
        List<Brand> brandList=new ArrayList<Brand>();
        String result="";
        String url="https://m.lechebang.com/gateway/car/getFirstLevelBrandType";
        String json="{\"cityId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"39d71c97-2f00-4f8a-8e6a-3b3743fa6dd5\"}";
        try {
            Response response= HTTP.post(url,String.format(json,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            BrandModel model=gson.fromJson(result,BrandModel.class);
            if(model.getMsg().equals("ok")){
                for(BrandResult result1:model.getResult()){
                    for(Brand brand:result1.getResults()){
                        brandList.add(brand);
                    }
                }
            }else {
                System.out.println("GetCarBrands方法:"+model.getMsg());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return brandList;
    }
}

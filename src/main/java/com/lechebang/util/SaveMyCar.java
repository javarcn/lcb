package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.SaveCar;
import com.lechebang.model.SaveCarModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SaveMyCar {
    public static Logger logger=Logger.getLogger(SaveMyCar.class);

    public static SaveCar ok(int brandId, String brandName, String imgUrl, int secondId, int produceId, String carTypeName, int brandTypeId, String yearType, String name){
        SaveCar saveCar=new SaveCar();
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/saveMyCar";
        String json="{\"brandId\":%s,\"brandName\":\"%s\",\"imgUrl\":\"%s\",\"secondId\":%s,\"produceId\":%s,\"carTypeName\":\"%s\",\"brandTypeId\":%s,\"yearType\":\"%s\",\"name\":\"%s\",\"buyDate\":1451577600000,\"mileage\":\"5000\",\"isCanUse\":1,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"cfc4b1d7-78f2-438e-8d8f-af7c8a0bcdbf\"}";
        try {
            Response response= HTTP.post(url,String.format(json,brandId,brandName,imgUrl,secondId,produceId,carTypeName,brandTypeId,yearType,name,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            SaveCarModel model=gson.fromJson(result,SaveCarModel.class);
            if(model.getMsg().equals("ok")){
                saveCar=model.getResult();
            }else {
                logger.error(model.getMsg()+"SaveMyCar方法执行失败:brandTypeId="+brandTypeId+",carTypeName="+carTypeName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saveCar;
    }
}

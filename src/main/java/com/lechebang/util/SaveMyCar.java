package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.SaveCar;
import com.lechebang.model.SaveCarModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/2/28.
 */
public class SaveMyCar {
    public static Logger logger=Logger.getLogger(SaveMyCar.class);

    public static SaveCar ok(int brandId, String brandName, String imgUrl, int secondId, int produceId, String carTypeName, int brandTypeId, String yearType, String name){
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/saveMyCar";
        String json="{\"brandId\":%s,\"brandName\":\"%s\",\"imgUrl\":\"%s\",\"secondId\":%s,\"produceId\":%s,\"carTypeName\":\"%s\",\"brandTypeId\":%s,\"yearType\":\"%s\",\"name\":\"%s\",\"buyDate\":1451577600000,\"mileage\":\"5000\",\"isCanUse\":1,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"cfc4b1d7-78f2-438e-8d8f-af7c8a0bcdbf\"}";
        SaveCarModel model=null;
        int retryTimes=1;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,brandId,brandName,imgUrl,secondId,produceId,carTypeName,brandTypeId,yearType,name,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,SaveCarModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult();
                }else {
                    logger.error(model.getMsg()+"SaveMyCar方法执行失败:brandTypeId="+brandTypeId+",carTypeName="+carTypeName);
                }
            } catch (Exception e) {
                logger.error("brandTypeId="+brandTypeId+",carTypeName="+carTypeName+"Post访问：https://m.lechebang.com/gateway/mycar/saveMyCar 出现异常，1s后进行第"+retryTimes+"次重试!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        }while (++retryTimes<6);
        throw new RuntimeException("服务端异常，超出重试次数");
    }
}

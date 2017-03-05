package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.CarTypeModel;
import com.lechebang.model.CarTypeResult;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarType {

    public static Logger logger=Logger.getLogger(GetCarType.class);


    public static List<CarTypeResult> list(int brandId, int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/car/getBrandProducerCar";
        String json="{\"brandId\":%s,\"cityId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"10da707e-8c79-4417-be49-459ddf6a3415\"}";
        int retryTimes=1;
        CarTypeModel model=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,brandId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,CarTypeModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult();
                }else {
                    logger.error(model.getMsg()+"GetCarType方法执行失败:brandId="+brandId+",cityId="+cityId);
                }
            } catch (Exception e) {
                logger.error("brandId="+brandId+"cityId="+cityId+",Post访问：https://m.lechebang.com/gateway/car/getBrandProducerCar 出现异常，1s后进行第"+retryTimes+"次重试!");
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

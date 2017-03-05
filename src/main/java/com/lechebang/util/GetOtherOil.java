package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.Oil;
import com.lechebang.model.OilModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetOtherOil {

    public static Logger logger=Logger.getLogger(GetOtherOil.class);

    public static List<Oil> list(int brandTypeId, int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/oilinfo/getOilInfoPriceResultOfBrandType";
        String json="{\"brandTypeId\":%d,\"cityId\":%d,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"5981fe82-ff03-478e-b28e-6f82f6ae5f08\"}";
        int retryTimes=1;
        OilModel model=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,brandTypeId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,OilModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult();
                }else {
                    logger.error(model.getMsg()+"GetOtherOil方法执行失败:brandTypeId="+brandTypeId+",cityId="+cityId);
                }
            } catch (Exception e) {
                logger.error("brandTypeId="+brandTypeId+",cityId="+cityId+"Post访问：https://m.lechebang.com/gateway/oilinfo/getOilInfoPriceResultOfBrandType 出现异常，1s后进行第"+retryTimes+"次重试!");
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

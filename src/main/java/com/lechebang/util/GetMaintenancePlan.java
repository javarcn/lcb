package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.PlanModel;
import com.lechebang.model.PlanResult;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetMaintenancePlan {

    public static Logger logger=Logger.getLogger(GetMaintenancePlan.class);

    public static PlanResult list(int cityId, int carId){
        String result="";
        String url="https://m.lechebang.com/gateway/plan/getCurrentMaintenancePlan";
        String json="{\"mileage\":5000,\"cityId\":%s,\"carId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"2b7b248c-2fcf-4141-b4e2-fdf0469344a6\"}";
        try {
            Response response= HTTP.post(url,String.format(json,cityId,carId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            PlanModel model=gson.fromJson(result,PlanModel.class);
            if(model.getMsg().equals("ok")){
                return model.getResult().getLcbSkuPrice();
            }else {
                logger.error(model.getMsg()+"GetMaintenancePlan方法执行失败:carId="+carId+",cityId="+cityId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.PlanModel;
import com.lechebang.model.PlanResult;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetMaintenancePlan {

    public static Logger logger=Logger.getLogger(GetMaintenancePlan.class);

    public static PlanResult list(int cityId, int carId){
        String result="";
        String url="https://m.lechebang.com/gateway/plan/getCurrentMaintenancePlan";
        String json="{\"mileage\":5000,\"cityId\":%s,\"carId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"2b7b248c-2fcf-4141-b4e2-fdf0469344a6\"}";
        int retryTimes=1;
        PlanModel model=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,cityId,carId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,PlanModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult().getLcbSkuPrice();
                }else {
                    logger.error(model.getMsg()+"GetMaintenancePlan方法执行失败:carId="+carId+",cityId="+cityId);
                }
            } catch (Exception e) {
                logger.error("carId="+carId+",cityId="+cityId+"Post访问：https://m.lechebang.com/gateway/plan/getCurrentMaintenancePlan 出现异常，1s后进行第"+retryTimes+"次重试!");
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

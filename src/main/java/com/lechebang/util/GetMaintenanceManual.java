package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.ManualModel;
import com.lechebang.model.ManualResult;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetMaintenanceManual {

    public static Logger logger=Logger.getLogger(GetMaintenanceManual.class);

    public static List<ManualResult> list(int carId, int cityId){
        String result="";
        String url="https://m.lechebang.com/gateway/plan/getMaintenanceManual";
        String json="{\"carId\":%s,\"cityId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"d61b854a-faa0-4245-9e50-7691304678d3\"}";
        ManualModel model=null;
        int retryTimes=1;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,carId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,ManualModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult();
                }else {
                    logger.error(model.getMsg()+"GetMaintenanceManual方法执行失败:carId="+carId+",cityId="+cityId);
                }
            } catch (Exception e) {
                logger.error("carId="+carId+",cityId="+cityId+"Post访问：https://m.lechebang.com/gateway/plan/getMaintenanceManual 出现异常，1s后进行第"+retryTimes+"次重试!");
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

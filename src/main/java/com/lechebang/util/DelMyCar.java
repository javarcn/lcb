package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.DelCar;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/2/28.
 */
public class DelMyCar {

    public static Logger logger=Logger.getLogger(DelMyCar.class);

    public static boolean ok(int id){
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/delMyCar";
        String json="{\"id\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"d6774db2-5c59-4c05-9cf4-d524bc92c434\"}";
        boolean flag=false;
        DelCar delCar=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,id,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                delCar=gson.fromJson(result,DelCar.class);
                if(delCar.isResult()){
                    flag=true;
                }
            } catch (Exception e) {
                logger.error("id="+id+"Post访问：https://m.lechebang.com/gateway/mycar/delMyCar 出现异常，1s后进行重试!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        }while (!flag);
        return flag;
    }
}

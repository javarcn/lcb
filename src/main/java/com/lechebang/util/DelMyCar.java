package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.DelCar;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Administrator on 2017/2/28.
 */
public class DelMyCar {

    public static Logger logger=Logger.getLogger(DelMyCar.class);

    public static boolean ok(int id){
        String result="";
        String url="https://m.lechebang.com/gateway/mycar/delMyCar";
        String json="{\"id\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"d6774db2-5c59-4c05-9cf4-d524bc92c434\"}";
        try {
            Response response= HTTP.post(url,String.format(json,id,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            DelCar delCar=gson.fromJson(result,DelCar.class);
            if(delCar.getMsg().equals("ok")){
                return true;
            }else {
                logger.error(delCar.getMsg()+"DelMyCar 执行失败:id="+id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.City;
import com.lechebang.model.CityModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCitys {

    public static Logger logger=Logger.getLogger(GetCitys.class);

    public static List<City> list(){
        String result="";
        String url="https://m.lechebang.com/gateway/maintenance/getCitys";
        String json="{\"version\":\"2.2.0\",\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"9dc87c89-7e7d-43c8-9a98-8dd76a1b9414\"}";
        int retryTimes=1;
        CityModel model=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,CityModel.class);
                if(model.getMsg().equals("ok")){
                    return model.getResult().getAll();
                }else {
                    logger.error(model.getMsg()+"GetCitys方法执行失败!");

                    System.out.println("GetCitys方法:"+model.getMsg());
                }
            } catch (Exception e) {
                logger.error("Post访问：https://m.lechebang.com/gateway/maintenance/getCitys 出现异常，1s后进行第"+retryTimes+"次重试!");
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

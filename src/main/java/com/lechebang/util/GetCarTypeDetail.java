package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.TypeDetail;
import com.lechebang.model.TypeModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class GetCarTypeDetail {

    public static Logger logger=Logger.getLogger(GetCarTypeDetail.class);

    public static List<TypeDetail> list(int brandId){
        String result="";
        String url="https://m.lechebang.com/gateway/car/getCarTypeDetail";
        String json="{\"brandId\":%s,\"token\":\"%s\",\"appCode\":%s,\"lcb_client_id\":\"%s\",\"lcb_request_id\":\"a2083739-caa1-4bf3-b5f2-7ae29718e52a\"}";
        int retryTimes=1;
        TypeModel model=null;
        do {
            try {
                Response response= HTTP.post(url,String.format(json,brandId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
                result=response.getTextBody();
                //TODO 解析json
                Gson gson=new Gson();
                model=gson.fromJson(result,TypeModel.class);
                if(model.getMsg().trim().equals("ok")){
                    return model.getResult();
                }else {
                    logger.error(model.getMsg()+"GetCarTypeDetail方法执行失败:brandId="+brandId);
                }
            } catch (Exception e) {
                logger.error("brandId="+brandId+",Post访问：https://m.lechebang.com/gateway/car/getCarTypeDetail 出现异常，1s后进行第"+retryTimes+"次重试!");
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

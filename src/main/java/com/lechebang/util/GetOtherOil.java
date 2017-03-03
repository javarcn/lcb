package com.lechebang.util;

import com.google.gson.Gson;
import com.lechebang.model.Oil;
import com.lechebang.model.OilModel;
import com.m3.curly.HTTP;
import com.m3.curly.Response;
import org.apache.log4j.Logger;

import java.io.IOException;
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
        try {
            Response response= HTTP.post(url,String.format(json,brandTypeId,cityId,Constants.TOKEN,Constants.APPCODE,Constants.LCB_CLIENT_ID).getBytes(),"text/json");
            result=response.getTextBody();
            //TODO 解析json
            Gson gson=new Gson();
            OilModel model=gson.fromJson(result,OilModel.class);
            if(model.getMsg().equals("ok")){
                return model.getResult();
            }else {
                logger.error(model.getMsg()+"GetOtherOil方法执行失败:brandTypeId="+brandTypeId+",cityId="+cityId);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

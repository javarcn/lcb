package com.lechebang;

import com.lechebang.model.*;
import com.lechebang.util.*;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static Logger logger=Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "数据爬取开始！" );
        //TODO 获取城市
        logger.info("获取城市****************************************");
        List<City> cityList=GetCitys.list();
        for (City city:cityList){
            System.out.println(city.toString());
            //TODO 获取品牌
            List<Brand> brandList=GetCarBrands.list(city.getCode());
            for(Brand brand:brandList){
                //TODO 获取型号
                List<CarTypeResult> carTypeResultList =GetCarType.list(brand.getId(),city.getCode());
                for(CarTypeResult result: carTypeResultList){
                    for(CarType type:result.getBrandProduceCar()){
                        //TODO 获取车款配置
//                        System.out.println(result.getProducerName()+type.toString());
                        List<TypeDetail> typeDetailList=GetCarTypeDetail.list(type.getId());
                        for(TypeDetail typeDetail:typeDetailList){
                            System.out.println(typeDetail.toString());
                        }
                    }
                }
            }
        }
        //TODO 获取品牌
        logger.info("获取品牌****************************************");
        logger.info(GetCarBrands.list(10201));
        List<Brand> brandList=GetCarBrands.list(10201);
        for(Brand brand:brandList){
            logger.info(brand.toString());
        }
        //TODO 获取型号
        logger.info("获取型号****************************************");
        logger.info(GetCarType.list(3522,10201));

        List<CarTypeResult> carTypeResultList =GetCarType.list(3522,10201);
        for(CarTypeResult result: carTypeResultList){
            for(CarType type:result.getBrandProduceCar()){
                logger.info(result.getProducerName()+type.toString());
            }
        }

        //TODO 获取车款配置
        logger.info("获取车款配置****************************************");
        logger.info(GetCarTypeDetail.list(21883));
        List<TypeDetail> typeDetailList=GetCarTypeDetail.list(21883);
        for(TypeDetail typeDetail:typeDetailList){
            logger.info(typeDetail.toString());
        }

        //TODO 保存汽车型号
        logger.info("保存汽车型号****************************************");
        logger.info(SaveMyCar.ok(3522,"奔驰","",3523,21883,"GLE级",21934,"2016款","GLE 300d 4MATIC"));
        SaveCar saveCar=SaveMyCar.ok(3522,"奔驰","",3523,21883,"GLE级",21934,"2016款","GLE 300d 4MATIC");
        logger.info(saveCar.toString());

        //TODO 查询保养方案(会存在token失效的情况)
        logger.info("查询保养方案****************************************");
        logger.info(GetMaintenancePlan.list(10201,1829332));
        PlanResult planResult=GetMaintenancePlan.list(10201,1829332);
        for (Plan plan:planResult.getLstAllItemLcbPrice()){
            logger.info(plan.toString());
        }

        //TODO 其他机油
        logger.info("其他机油****************************************");
        logger.info(GetOtherOil.list(16565,10201));
        //TODO 保养手册
        logger.info("保养手册****************************************");
        logger.info(GetMaintenanceManual.list(1829332,10201));
        //TODO 删除汽车
        logger.info("删除汽车****************************************");
        logger.info(DelMyCar.ok(1815965));
        System.out.println( "数据爬取结束！" );

    }
}

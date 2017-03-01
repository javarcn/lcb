package com.lechebang;

import com.lechebang.model.*;
import com.lechebang.util.*;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //TODO 获取城市
        System.out.println("获取城市****************************************");
        System.out.println(GetCitys.list());
        List<City> cityList=GetCitys.list();
        for (City city:cityList){
            System.out.println(city.toString());
        }
        //TODO 获取品牌
        System.out.println("获取品牌****************************************");
        System.out.println(GetCarBrands.list(10201));
        List<Brand> brandList=GetCarBrands.list(10201);
        for(Brand brand:brandList){
            System.out.println(brand.toString());
        }
        //TODO 获取型号
        System.out.println("获取型号****************************************");
        System.out.println(GetCarType.list(3522,10201));

        List<CarTypeResult> carTypeResultList =GetCarType.list(3522,10201);
        for(CarTypeResult result: carTypeResultList){
            for(CarType type:result.getBrandProduceCar()){
                System.out.println(result.getProducerName()+type.toString());
            }
        }

        //TODO 获取车款配置
        System.out.println("获取车款配置****************************************");
        System.out.println(GetCarTypeDetail.list(21883));
        List<TypeDetail> typeDetailList=GetCarTypeDetail.list(21883);
        for(TypeDetail typeDetail:typeDetailList){
            System.out.println(typeDetail.toString());
        }

        //TODO 保存汽车型号
        System.out.println("保存汽车型号****************************************");
        System.out.println(SaveMyCar.ok(3522,"奔驰","",3523,21883,"GLE级",21934,"2016款","GLE 300d 4MATIC"));
        SaveCar saveCar=SaveMyCar.ok(3522,"奔驰","",3523,21883,"GLE级",21934,"2016款","GLE 300d 4MATIC");
        System.out.println(saveCar.toString());

        //TODO 查询保养方案(会存在token失效的情况)
        System.out.println("查询保养方案****************************************");
        System.out.println(GetMaintenancePlan.list(10201,1819697));
        //TODO 其他机油
        System.out.println("其他机油****************************************");
        System.out.println(GetOtherOil.list(17513,10201));
        //TODO 保养手册
        System.out.println("保养手册****************************************");
        System.out.println(GetMaintenanceManual.list(1819697,10201));
        //TODO 删除汽车
        System.out.println("删除汽车****************************************");
        System.out.println(DelMyCar.ok(1815965));

    }
}

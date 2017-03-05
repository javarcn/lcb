package com.lechebang;

import com.lechebang.model.*;
import com.lechebang.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static Logger logger= Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        PropertyConfigurator.configure("src/log4j.properties");
        System.out.println( "数据爬取开始！" );
        long start= System.currentTimeMillis();
        //TODO 获取城市
        List<City> cityList=GetCitys.list();
//        for (City city:cityList){
        City city=new City();
        city.setCode(10101);
        city.setName("北京");
            logger.info("获取城市****************************************"+city.toString());
            //TODO 获取品牌
            List<Brand> brandList=GetCarBrands.list(city.getCode());
            for(Brand brand:brandList){
                //TODO 获取型号
                List<CarTypeResult> carTypeResultList =GetCarType.list(brand.getId(),city.getCode());
                for(CarTypeResult result: carTypeResultList){
                    for(CarType type:result.getBrandProduceCar()){
                        //TODO 获取车款配置
                        List<TypeDetail> typeDetailList=GetCarTypeDetail.list(type.getId());
                        for(TypeDetail typeDetail:typeDetailList){
//                            logger.info(brand.getBrandName()+result.getProducerName()+type.toString()+typeDetail.toString());
                            //TODO 保存汽车型号,得到ID
                            SaveCar saveCar=SaveMyCar.ok(brand.getId(),brand.getBrandName(),"",result.getId(),type.getId(),type.getCarName(),typeDetail.getId(),typeDetail.getYearName(),typeDetail.getCarDetailName());
/*                            //TODO 查看保养计划
                            PlanResult planResult=GetMaintenancePlan.list(city.getCode(),saveCar.getId());
                            for (Plan plan:planResult.getLstAllItemLcbPrice()){
                                logger.debug(plan.toString());
                            }
                            //TODO 其他机油
                            List<Oil> oilList=GetOtherOil.list(typeDetail.getId(),city.getCode());
                            for(Oil oil:oilList){
                                logger.debug(oil.toString());
                            }
                            //TODO 保养手册
                            List<ManualResult>manualResultList=GetMaintenanceManual.list(saveCar.getId(),city.getCode());
                            for(ManualResult manual:manualResultList){
                                logger.debug(manual.toString());
                            }*/
                            logger.debug(city.getName()+brand.getBrandName()+result.getProducerName()+type.getCarName()+typeDetail.getWholeName()+"抓取完毕");
                            //TODO 删除该车型
                            DelMyCar.ok(saveCar.getId());
                            logger.debug(city.getName()+brand.getBrandName()+result.getProducerName()+type.getCarName()+typeDetail.getWholeName()+"该车型删除成功!");
                        }
                    }
                }
            }
//        }
        System.out.println( "数据爬取结束！" );
        long end= System.currentTimeMillis();
        System.out.println("北京地区全部车型抓取完毕，共耗时："+(end-start)/1000+"秒");
    }
}

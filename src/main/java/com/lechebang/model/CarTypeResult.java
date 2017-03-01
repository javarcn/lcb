package com.lechebang.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class CarTypeResult {
    /**
     * id : 10702
     * isCanOrder : 1
     * producerName : 中华
     */

    private int id;
    private int isCanOrder;
    private String producerName;
    private List<CarType> brandProduceCar=new ArrayList<CarType>();

    public List<CarType> getBrandProduceCar() {
        return brandProduceCar;
    }

    public void setBrandProduceCar(List<CarType> brandProduceCar) {
        this.brandProduceCar = brandProduceCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsCanOrder() {
        return isCanOrder;
    }

    public void setIsCanOrder(int isCanOrder) {
        this.isCanOrder = isCanOrder;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
}

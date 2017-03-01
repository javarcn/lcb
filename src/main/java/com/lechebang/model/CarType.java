package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/1.
 */
public class CarType {

    /**
     * carImgUrl : https://ocpvd5a60.qnssl.com/e78f58f3-00e3-48ed-89bc-f00462104d93.jpg
     * carName : 尊驰
     * id : 10703
     */

    private String carImgUrl;
    private String carName;
    private int id;

    public String getCarImgUrl() {
        return carImgUrl;
    }

    public void setCarImgUrl(String carImgUrl) {
        this.carImgUrl = carImgUrl;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "carImgUrl='" + carImgUrl + '\'' +
                ", carName='" + carName + '\'' +
                ", id=" + id +
                '}';
    }
}

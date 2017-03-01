package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/1.
 */
public class TypeDetail {

    /**
     * carDetailName : 2.5 手自一体
     * id : 15383
     * imgUrl : null
     * wholeName : 2010款2.5 手自一体
     * yearName : 2010款
     */

    private String carDetailName;
    private int id;
    private Object imgUrl;
    private String wholeName;
    private String yearName;

    public String getCarDetailName() {
        return carDetailName;
    }

    public void setCarDetailName(String carDetailName) {
        this.carDetailName = carDetailName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Object imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWholeName() {
        return wholeName;
    }

    public void setWholeName(String wholeName) {
        this.wholeName = wholeName;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    @Override
    public String toString() {
        return "TypeDetail{" +
                "carDetailName='" + carDetailName + '\'' +
                ", id=" + id +
                ", imgUrl=" + imgUrl +
                ", wholeName='" + wholeName + '\'' +
                ", yearName='" + yearName + '\'' +
                '}';
    }
}

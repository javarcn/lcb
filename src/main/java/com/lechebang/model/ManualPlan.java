package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/4.
 */
public class ManualPlan {

    /**
     * discountValue : null
     * id : 761347
     * lcbPrice : 0
     * mileage : 10000
     * planName : null
     * price : 0
     * usedTime : 6
     */

    private Object discountValue;
    private int id;
    private int lcbPrice;
    private int mileage;
    private Object planName;
    private int price;
    private int usedTime;

    public Object getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Object discountValue) {
        this.discountValue = discountValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLcbPrice() {
        return lcbPrice;
    }

    public void setLcbPrice(int lcbPrice) {
        this.lcbPrice = lcbPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Object getPlanName() {
        return planName;
    }

    public void setPlanName(Object planName) {
        this.planName = planName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }
}

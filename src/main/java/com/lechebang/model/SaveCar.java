package com.lechebang.model;

/**
 * Created by Administrator on 2017/3/2.
 */
public class SaveCar {

    /**
     * brandTypeId : 15385
     * buyDate : 1293811200000
     * carNumber : null
     * carType : null
     * createdTime : 1488384328571
     * deleted : 0
     * engineNumber : null
     * id : 1820278
     * isDefault : null
     * mileage : 5000
     * updatedTime : null
     * userId : 5721481
     * vin : null
     */

    private int brandTypeId;
    private long buyDate;
    private Object carNumber;
    private Object carType;
    private long createdTime;
    private int deleted;
    private Object engineNumber;
    private int id;
    private Object isDefault;
    private int mileage;
    private Object updatedTime;
    private int userId;
    private Object vin;

    public int getBrandTypeId() {
        return brandTypeId;
    }

    public void setBrandTypeId(int brandTypeId) {
        this.brandTypeId = brandTypeId;
    }

    public long getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(long buyDate) {
        this.buyDate = buyDate;
    }

    public Object getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Object carNumber) {
        this.carNumber = carNumber;
    }

    public Object getCarType() {
        return carType;
    }

    public void setCarType(Object carType) {
        this.carType = carType;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Object getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(Object engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Object isDefault) {
        this.isDefault = isDefault;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Object getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Object updatedTime) {
        this.updatedTime = updatedTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Object getVin() {
        return vin;
    }

    public void setVin(Object vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "SaveCar{" +
                "brandTypeId=" + brandTypeId +
                ", buyDate=" + buyDate +
                ", carNumber=" + carNumber +
                ", carType=" + carType +
                ", createdTime=" + createdTime +
                ", deleted=" + deleted +
                ", engineNumber=" + engineNumber +
                ", id=" + id +
                ", isDefault=" + isDefault +
                ", mileage=" + mileage +
                ", updatedTime=" + updatedTime +
                ", userId=" + userId +
                ", vin=" + vin +
                '}';
    }
}
